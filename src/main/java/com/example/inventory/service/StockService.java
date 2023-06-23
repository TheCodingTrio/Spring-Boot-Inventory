package com.example.inventory.service;

import com.example.inventory.dto.StockDTO;
import com.example.inventory.entity.Stock;
import com.example.inventory.repo.StockRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StockService {

    @Autowired
    private StockRepo stockRepo;

    @Autowired
    private ModelMapper modelMapper;

    public StockDTO saveStock(StockDTO stockDTO){
        stockRepo.save(modelMapper.map(stockDTO, Stock.class));
        return stockDTO;
    }

    public List<StockDTO> getStocks(){
        List<Stock>stockList= stockRepo.findAll();
        return modelMapper.map(stockList, new TypeToken<List<StockDTO>>(){}.getType());
    }

    public StockDTO updateStock(StockDTO stockDTO){
        stockRepo.save(modelMapper.map(stockDTO, Stock.class));
        return stockDTO;
    }

    public boolean deleteStock(StockDTO stockDTO){
        stockRepo.save(modelMapper.map(stockDTO, Stock.class));
        return true;
    }

    public StockDTO getStockByID(String stockID){
       Stock stock =  stockRepo.getStockByID(stockID);
       return modelMapper.map(stock, StockDTO.class);
    }

    public StockDTO getStockByIDAndName(String stockId, String name){
        Stock stock = stockRepo.getStockByIDAndName(stockId, name);
        return modelMapper.map(stock, StockDTO.class);
    }


}
