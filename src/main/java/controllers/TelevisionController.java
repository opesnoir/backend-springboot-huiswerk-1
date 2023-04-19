package controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

//springboot vertellen dat dit niet zo maar een klasse is maar een controller zeg je @RestController
//nu weet springboot dit is een klasse waar requests van de user gaan binnen komen.
// vb restcontroller en mapping opzetten: @RestController
// public class BooksController {
/*        @GetMapping("/book")
        public ResponseEntity<String> getBook() {
            return ResponseEntity.ok(“Novi”);
     }
    }*/
/*@PostMapping("/book")
public ResponseEntity<Object> addBook(@RequestBody String title) {
        …(hier wordt iets opgeslagen in de database)...
        String name = “NOVI”
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{name}")
        .buildAndExpand(name).toUri();
        return ResponseEntity.created(location).build();
        }*/
/*@DeleteMapping("/books/{id}")
public ResponseEntity<Object> deleteBook(@PathVariable int id) {
        …(hier wordt een naam verwijderd uit de database)...
        return ResponseEntity.noContent();
        }*/
/*@PutMapping("books/{id}")
public ResponseEntity<Object> updateBook(@PathVariable int id, @RequestBody String bookTitle) {
        …(hier wordt een resource aangepast)
        return ResponseEntity.noContent();
        }*/

/*@GetMapping("/books/{id}")
public ResponseEntity<Object> getBook(@PathVariable long id) {
        return ResponseEntity.ok(...);
        }*/

/*@GetMapping("/books")
public ResponseEntity<Object> getAllBooks(@RequestParam String title) {
        return ...;
        }*/


//definieer controller
@RestController
public class TelevisionController {


    //definieer soort endpoint-request: get request voor alle televisies
    @GetMapping("/televisions")
    public ResponseEntity<String> getAllTelevisions(){
        return ResponseEntity.ok("televisions");
    }


/*    uitleg: @PathVariable is een annotatie die aangeeft dat de waarde van de variabele uit de URL-path moet worden opgehaald. In dit voorbeeld wordt de waarde van de id-variabele opgehaald uit het pad van de URL (/televisions/{id}). Door @PathVariable("id") te gebruiken, vertel je Spring MVC om de waarde van id uit de URL te binden aan de int id parameter van de getOneTelevision methode.*/
    @GetMapping("/televisions/{id}")
    public ResponseEntity<String> getOneTelevision(@PathVariable ("id") int id){
        return ResponseEntity.ok("television-id" + id);
    }


    @PostMapping("/televisions")
    public ResponseEntity<Object> addTelevision(@RequestBody String television){
        return ResponseEntity.created(null).body("televisions");
    }


    @DeleteMapping("televisions/{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable int id){
        return ResponseEntity.noContent().build();
    }


    @PutMapping("/televisions/{id}")
    public ResponseEntity<Object> updateTelevision(@PathVariable int id, @RequestBody String television){
        return ResponseEntity.noContent().build();
    }


}