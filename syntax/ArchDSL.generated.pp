[
   Application                 -- _1 _2,
   Application.1:iter-star     -- _1,
   Application.2:iter-star     -- _1,
   Include                     -- KW["include"] _1 KW[";"],
   InterfaceDef                -- KW["interface"] _1 _2 KW[";"],
   InterfaceDef.2:opt          -- _1,
   ComponentDef                -- KW["component"] _1 _2 KW["{"] _3 _4 KW["}"],
   ComponentDef.2:opt          -- _1,
   ComponentDef.3:iter-star    -- _1,
   ComponentDef.4:iter-star    -- _1,
   AdapterDef                  -- KW["adapter"] _1 _2 KW["{"] _3 _4 KW["}"],
   AdapterDef.2:opt            -- _1,
   AdapterDef.3:iter-star      -- _1,
   AdapterDef.4:iter-star      -- _1,
   ArchitectureDef             -- KW["architecture"] _1 KW["{"] _2 KW["}"],
   ArchitectureDef.2:iter-star -- _1,
   BuiltInClass                -- KW["using"] _1,
   Param                       -- KW["param"] _1 KW["="] _2 KW[";"],
   EndPointDef                 -- _1 _2 KW["endpoint"] _3 _4 KW[";"],
   EndPointDef.1:opt           -- _1,
   Component                   -- KW["component"] _1 _2 KW[";"],
   Adapter                     -- KW["adapter"] _1 _2 KW[";"],
   Link                        -- KW["link"] _1 _2 KW[";"],
   Subarchitecture             -- KW["subarchitecture"] _1 _2 KW[";"],
   ArchEndpointDef             -- _1 _2 KW["endpoint"] _3 _4 KW[";"],
   ArchEndpointDef.1:opt       -- _1,
   EndPoint                    -- _1 KW["."] _2,
   Incoming                    -- KW["incoming"],
   Outgoing                    -- KW["outgoing"],
   Inout                       -- KW["inout"],
   Optional                    -- KW["optional"]
]