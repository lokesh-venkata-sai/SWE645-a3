package com.example.SWE645a3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SurveyController {
	
    @Autowired
    SurveyRepository surveyRepository;
    
    @Autowired
    SurveyService surveyService;
    
    @CrossOrigin
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String Test() {
        return "swe645 test";
    }
    
    @CrossOrigin
    @RequestMapping(value = "/surveys", method = RequestMethod.GET)
    @ResponseBody
    public List<SurveyModel> getAllSurveysDetail() {
//        return surveyRepository.findAll();
        return surveyService.getAllSurveys();
    }
    
    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(value = "/survey", method = RequestMethod.POST)
    @ResponseBody
    public SurveyModel addSurvey(@RequestBody SurveyModel survey) {
        try{
        	return surveyRepository.save(survey);
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    @RequestMapping(value = "/findsurvey", method = RequestMethod.GET)
    @ResponseBody
    public SurveyModel findSurveyById(@RequestParam("surveyId") int surveyId) {
//        return surveyRepository.findById(surveyId);
    	return surveyService.getSurveyById(surveyId);
    }
    
    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(value = "/updatesurvey", method = RequestMethod.GET)
    @ResponseBody
    public SurveyModel updateStudent(@RequestBody SurveyModel survey) {
    	try{
        	return surveyRepository.save(survey);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @RequestMapping(value = "/deletesurvey", method = RequestMethod.GET)
    @ResponseBody
    public int deleteSurveyById(@RequestParam("surveyId") int surveyId) {
//        return surveyRepository.deleteById(surveyId);
    	return surveyService.deleteSurvey(surveyId);
    }
}
