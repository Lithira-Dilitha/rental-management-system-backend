package edu.ict.rms.service.item;

import edu.ict.rms.dto.Item;

import java.util.List;

public interface ItemService {
    void save(Item item);
    void update(Item item);
    void delete(Long id);
    List<Item>getAllItems();
}
