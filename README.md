Purpose : To understand how graphQL works in Spring Boot project.

ORM tool used : JPA

GraphQL used for: specifically used in case we dynamically want to decide request and response params of API

H2 db used for : to create a temporary db in memory at runtime

Extra changes to be done for adding Graphql in Springboot JPA project : 
1.schema file for graphQL query and mutation defination
2.Request Mapping to be updated in Controller : either use @QueryMapping , @MutationMapping or use @SchemaMapping

After running application:

goto url:http://localhost:8009/h2-console

![image](https://github.com/nandiniverma24/GraphQL-SpringBoot-Project/assets/163345428/9239d3bb-ab84-4370-8b35-cd31af7698d1)

On connecting to db , your table will be visible in list:

![image](https://github.com/nandiniverma24/GraphQL-SpringBoot-Project/assets/163345428/8d1f5137-243d-452a-a774-ffb639aa48c1)

Extra Info:

Difference in Query and Mutation in Graphql:
In Schema files we define :
1.Query: to get data
2.Mutation : in case of data insertion/updation/deletion


