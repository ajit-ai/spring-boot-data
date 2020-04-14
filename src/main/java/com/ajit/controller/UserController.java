package com.ajit.controller;


//Changes from abc to master
//git rebase to master code.
import com.ajit.model.UserDetails;
import com.ajit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    private String str;

    /**+
     * sample hello
     * @return
     */
    @RequestMapping("/hello")
    public String sayHello() {
        return "ajit here!";
    }

    /**+
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<UserDetails>> userDetails() {

        List<UserDetails> userDetails = userService.getUserDetails();
        return new ResponseEntity<List<UserDetails>>(userDetails, HttpStatus.OK);
    }

    /**+
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserDetails> findById(@PathVariable(name = "id", value = "id") Long id) {

        UserDetails userDetail = userService.findById(id);
        return new ResponseEntity<UserDetails>(userDetail, HttpStatus.OK);
    }

    /**+
     *
     * @param userDetails
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<UserDetails> findById(@RequestBody UserDetails userDetails) {

        UserDetails userDetail = userService.save(userDetails);
        return new ResponseEntity<UserDetails>(userDetail, HttpStatus.OK);
    }

    /**+
     *
     * @param email
     * @return
     */
    @RequestMapping(value = "/email/{email:.+}", method = RequestMethod.GET)
    public ResponseEntity<UserDetails> findById(@PathVariable(name = "email", value = "email") String email) {

        UserDetails userDetail = userService.findByEmail(email);
        return new ResponseEntity<UserDetails>(userDetail, HttpStatus.OK);
    }

    /**+
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(@PathVariable(name = "id", value = "id") Long id) {

        userService.delete(id);
        return new ResponseEntity<String>("success", HttpStatus.OK);
    }

    /**+
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deletes(@PathVariable(name = "id", value = "id") Long id) {

        userService.delete(id);
        return new ResponseEntity<String>("success", HttpStatus.OK);
    }

}
