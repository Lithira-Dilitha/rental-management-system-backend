package edu.ict.rms.contoller;

import edu.ict.rms.dto.Item;
import edu.ict.rms.service.item.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item-controller")
@RequiredArgsConstructor
public class ItemController {
    final ItemService service;

    @PostMapping("/item")
    void save(@RequestBody Item item){
        service.save(item);
    }
    @PutMapping("/item")
    void update(@RequestBody Item item){
        service.update(item);
    }
    @DeleteMapping("/item/{id}")
    void delete(@PathVariable Long id){
        service.delete(id);
    }
    @GetMapping("/items")
    List<Item> getAll(){
        return service.getAllItems();
    }
}
