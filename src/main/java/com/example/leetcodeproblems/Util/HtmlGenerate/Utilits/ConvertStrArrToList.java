package com.example.leetcodeproblems.Util.HtmlGenerate.Utilits;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ConvertStrArrToList {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"1", "2", "3", "4", "5"};
        List list = Arrays.asList(arr1);

        System.out.println(list);
    }


    public static void convertArrToList() throws IOException {
        String convert = """
                
                       <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">Convert String Array to List</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div  class="contact-wrap w-100 p-md-5 p-4 py-5">
                                              
                                                 <img class = "center zoom"alt="" src="../../../../photo/utilits/convertStringArrToList.png" ">  
                                            
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                """;

    }
}




