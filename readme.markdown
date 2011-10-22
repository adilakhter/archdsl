What is archDSL? 
==============
*archDSL* is a unified _domain-specific language_ for declaratively describing software architectures. It defines software architecture declaratively and generates xADL 2.0[1] architecture specifications. It is built using *Spoofax Language Workbench*.The resulting architectures are primarily targeted to the Myx Framework. However, it can be targeted to different framework as well since the xADL file format is, per se, not a framework specific description.

[1] http://www.isr.uci.edu/projects/xarchuci/

### Motivation 
The existing eclipse plugin - ArchStudio provides a graphical interface for drawing diagrams that is further translated to xADL 2.0 format. However, it has several limitation and the drawing interface is unstable and inconsistent. Few of the existing usability problems:

* No undo/redo functionality
* No support for keyboard shortcuts
* A lot of redundant and duplicate operations in order to create a simple HelloWorld example 
* so on. 

In addition, the generated XML file of xADL architecture is verbose and difficult to perceive. For a simple architecture, a huge XML of 670 lines is generated. Thus, it makes it quite difficult to write the xml specification by hand.

### The Language
ArchDSL is a statically typed textual DSL  that allow users to express architecture declaratively. Using ArchDSL, one can define components, adapters, interfaces for components and the connections between them. Basically, two components can communicate if they both share the same interface.The ArchDSL's language is composed of a very few primitives:

`interface <InterfaceName>;`

is used to describe an interface. This interface can be them instantiated in components and adapters in order to create endpoints. 

```
(component|adapter) <name>{
    [optional] (incoming|outgoing|inout) endpoint <endpointInstanceName>;
}
```

is used to define components/adapters and theirs exposed interfaces. Here an interface can be instantiated and one can specify is this interface is required and what is its direction. An interface defined as 'incoming' will only support external calls and will not send any messages to the links connected to it. On contrary, and 'outgoing' interface will only send message and accept none. The 'inout' interface will both send and receive external calls.

Many interfaces can be defined for a component. There can be even multiple interfaces of the same type.
_For example : _

For the following chat client-server architecture (drawn with ArchStudio) 

![chatserver](http://dl.dropbox.com/u/1367250/archdsl/chatclient-arch.jpg)

we have-

* purple = component
* yellow = adapter
* small white rectangles = interfaces
* lines between interface = links

Following is the xADL description generated for this chat client-server architecture - 

![xadl](http://dl.dropbox.com/u/1367250/archdsl/xadl.jpg)

Using ArchDSL, the above architecture can be described as follows :

```
interface IChatEvents;

    component ChatServer
    {
        optional incoming endpoint IChat chat;
        outgoing endpoint IChatEvents    chatEv;
    }

    component ChatClient
    {
        optional outgoing endpoint IChat chat;
        incoming endpoint IChatEvents    chatEv;
    }

    adapter EventPump
    {
        incoming endpoint IChatEvents inEv;
        outgoing endpoint IChatEvents outEv;
    }

    architecture ChatApplication
    {
        component ChatServer server;
        component ChatClient client1;
        component ChatClient client2;
        adapter   EventPump  pump;

        link server.chat    client1.chat;
        link server.chat    client2.chat;
        link pump.inEv      server.chatEv;
        link pump.outEv     client1.chatEv;
        link client2.chatEv pump.outEv;
    }
```

It generates a similar xADL description as above and the Java files (targeted specially for the Myx Framework) required for this architecture. 

_TODO : more details_

### To Build 

To build the archDSL compiler you will need a recent version of Eclipse (3.5+) and Spoofax. When those are installed, simply clone the archDSL repository and import it into Eclipse, then build the project (Ctrl+Alt+b or Ctrl+Cmd+b). 
