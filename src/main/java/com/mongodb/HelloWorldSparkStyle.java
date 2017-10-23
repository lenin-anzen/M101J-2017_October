package com.mongodb;

import spark.Route;
import spark.Spark;
import spark.Request;
import spark.Response;

/**
 * Hello world!
 *
 */
public class HelloWorldSparkStyle 
{
    public static void main( String[] args )
    {
        Spark.get("/", new Route() {
            @Override
            public Object handle(final Request request, final Response response) {
                return "Hello World from Spark!!!";
                // throw new UnsupportedOperationException();
            }
        });
    }
}
