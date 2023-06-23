package com.example.inventory.controller;

import com.example.inventory.dto.StockDTO;
import com.example.inventory.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/stock")
@CrossOrigin
public class StockController {
    @Autowired
    private StockService stockService;

    @GetMapping("/getStocks")
    public List<StockDTO> getStocks(){
        return stockService.getStocks();
    }

    @PostMapping("/saveStock")
    public StockDTO saveStock(@RequestBody StockDTO stockDTO){
        return stockService.saveStock(stockDTO);
    }

    @PutMapping("/updateStock")
    public StockDTO updateStock(@RequestBody StockDTO stockDTO){
        return stockService.updateStock(stockDTO);
    }

    @DeleteMapping("/deleteStock ")
    public boolean deleteStock(@RequestBody StockDTO stockDTO){
        return stockService.deleteStock(stockDTO);
    }

    @GetMapping("/getStockById/{stockID}")
    public StockDTO getStockByID(@PathVariable String stockID){
        return stockService.getStockByID(stockID);
    }

    @GetMapping("getStockByIdAndName/{stockId}/{name}")
    public StockDTO getStockByIDAndName(@PathVariable String stockId, @PathVariable String name){
        return stockService.getStockByIDAndName(stockId, name);
    }


    ////get mapping



}
