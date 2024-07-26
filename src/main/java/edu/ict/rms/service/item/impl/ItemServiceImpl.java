package edu.ict.rms.service.item.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ict.rms.dto.Item;
import edu.ict.rms.entity.ItemEntity;
import edu.ict.rms.repository.ItemRepository;
import edu.ict.rms.service.item.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    final ObjectMapper mapper;
    final ItemRepository repository;
    @Override
    public void save(Item item) {
        repository.save(mapper.convertValue(item, ItemEntity.class));
    }

    @Override
    public void update(Item item) {
        repository.save(mapper.convertValue(item, ItemEntity.class));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Item> getAllItems() {
        List<Item>itemList= new ArrayList<>();
        List<ItemEntity> itemEntities = repository.findAll();
        itemEntities.forEach(itemEntity ->
                itemList.add(mapper.convertValue(itemEntity,Item.class)
                ));
        return itemList;
    }
}
