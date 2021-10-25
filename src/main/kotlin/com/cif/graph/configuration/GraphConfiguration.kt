package com.cif.graph.configuration

import graphql.Scalars
import graphql.schema.*
import org.springframework.context.annotation.Bean
import java.util.concurrent.CompletableFuture


//class GraphConfiguration {
//    @Bean
//    fun schema(): GraphQLSchema? {
//        val test =
//            DataFetcher { env: DataFetchingEnvironment? ->
//                CompletableFuture.supplyAsync {
//                    try {
//                        Thread.sleep(2000)
//                    } catch (e: InterruptedException) {
//                        Thread.currentThread().interrupt()
//                    }
//                    "response"
//                }
//            }
//        return GraphQLSchema.newSchema()
//            .query(
//                GraphQLObjectType.newObject()
//                    .name("query")
//                    .field { field: GraphQLFieldDefinition.Builder ->
//                        field.name("test").type(Scalars.GraphQLString)
//                    }
//                    .build())
//            .codeRegistry(
//                GraphQLCodeRegistry.newCodeRegistry()
//                    .dataFetcher(FieldCoordinates.coordinates("query", "test"), test)
//                    .build()
//            )
//            .build()
//    }
//}