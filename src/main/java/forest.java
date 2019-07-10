import java.io.*;
import static spark.Spark.*;

public class forest {
        public static void main(String... args) throws IOException {

                get("/hello", (req, res) -> "Hello World");

                System.out.println("Init");
                if(args.length==0){
                    System.out.println("Hello world");
                }else {
                    throw new IOException();
                }

        }

}
