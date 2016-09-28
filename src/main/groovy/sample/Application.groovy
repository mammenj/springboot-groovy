package sample
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.*
import org.springframework.context.annotation.*
import org.springframework.web.bind.annotation.*

@RestController
@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
class Application {

 static void main(String[] args) {
  SpringApplication.run Application, args
 }
 
 @RequestMapping("/")
 String home(){
                "***************** Hello World from JSMammen *******************"
 }

}
