package com.qovery.billing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by evoxmusic on 02/12/2019.
 */
@RestController
@RequestMapping("/users")
public class InvoiceController {

    @GetMapping(path = "{userId}/invoices")
    public List<Invoice> listAll(@PathVariable String userId) {
        return Arrays.asList(
                new Invoice(99.99f, "USD", "Hard Disk"),
                new Invoice(499f, "USD", "LCD screen")
        );
    }

}
