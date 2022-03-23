package com.project.traveleasy.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.traveleasy.entity.BusDetails;
import com.project.traveleasy.entity.SeatStatus;
import com.project.traveleasy.services.BookingService;

@RestController
@CrossOrigin(origins = "*")
public class MyController {
	
	@Autowired
	private BookingService bookingservice;
	
/*	@GetMapping("/hello")
	public String fun1() {
		return "Working fine";
	}
*/
	
	@GetMapping("/location/{LocationID}")
	public String getLocationByID(@PathVariable int LocationID){
		return this.bookingservice.getLocationByID(LocationID);
	}
	
	
	@GetMapping("/locationsubset/{LocationSubsetID}")
	public String getLocationSubsetByID(@PathVariable int LocationSubsetID){
		return this.bookingservice.getLocationSubsetByID(LocationSubsetID);
	}
	
	
	@GetMapping("/locationsubsetlist/{LocationID}")
	public List<String> getLocationSubsetList(@PathVariable int LocationID){
		return this.bookingservice.getLocationSubsetList(LocationID);
	}
	
	
	@GetMapping("/locationsubsetlistbyname/{LocationName}")
	public List<String> getLocationSubsetListByName(@PathVariable String LocationName){
		return this.bookingservice.getLocationSubsetListByName(LocationName);
	}
	
	
	@GetMapping("/seatstatus/{BusID}/{date}")
	public List<SeatStatus> getSeatStatus(@PathVariable("BusID") int BusID,@PathVariable("date") String dateofbooking){
	
	return this.bookingservice.getSeatStatus(BusID,dateofbooking);
	
	}
	
	
	
	
	@GetMapping("/display/{from}/{to}/{date}")
    public List<BusDetails> getbuses(@PathVariable("from") String from ,
    		@PathVariable("to") String to , 
    		@PathVariable("date") String date)
    {
      return this.bookingservice.getBusList(from,to,date);
      
    }

	
	@GetMapping("/getsjID/{from}/{to}/{busid}/{date}")
	public int getScheduledJourneyID(
			@PathVariable("from") String from,
			@PathVariable("to") String to , 
			@PathVariable("busid") int BusID , 
			@PathVariable("date") String date )
	{
		return this.bookingservice.getScheduledJourneyID(from, to, BusID, date);
	}
	
	
	@GetMapping("/search/{searchtext}")
	public List<String> getSuggestions(@PathVariable("searchtext") String searchtext){
		return this.bookingservice.getSuggestions(searchtext);
	}
	
}
