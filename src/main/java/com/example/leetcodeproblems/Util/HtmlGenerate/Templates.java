package com.example.leetcodeproblems.Util.HtmlGenerate;

public class Templates {
    static String menu = """
            <!DOCTYPE html>
            <html class="no-js" lang="en">
            <head>
                <meta charset="UTF-8"/>
                <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
                <meta content="width=device-width, initial-scale=1.0" name="viewport">
                <title>Java Learn. Pet Project</title>
                <meta content="Blueprint: Horizontal Drop-Down Menu" name="description"/>
                <meta content="horizontal menu, microsoft menu, drop-down menu, mega menu, javascript, jquery, simple menu"
                      name="keywords"/>
                <meta content="Codrops" name="author"/>
                <link href="../favicon.ico" rel="shortcut icon">
                <link href="css/default.css" rel="stylesheet" type="text/css"/>
                <link href="css/component.css" rel="stylesheet" type="text/css"/>
                <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
                <script src="js/modernizr.custom.js"></script>

            </head>
            <body>
                        <div class="container">
                            <header class="clearfix">
                            </header>
                            <div class="main">
                                <nav class="cbp-hrmenu" id="cbp-hrmenu">
                                    <ul>
                                        <li>
                                            <a href="#">Java</a>
                                            <div class="cbp-hrsub">
                                                <div class="cbp-hrsub-inner">
                                                    <div>
                                                        <h4><a href="java.html"><h3 class="whiteTextOverride">General Info</h3></a></h4>
                                                    </div>
                                                    <div class="cbp-hrsub-inner"> <h4><a href="javaClass.html"><h3 class="whiteTextOverride">Clase</h3></a></h4>
                                                        <ul>
                                                            <li><h6><a href="claseVariblesMainGeneraInfo.html"><h6>Variabile</h6></a></h6></li>
                                                            <ul>
                                                                <li><a href="claseVariabilePrimitive.html">- Primitive</a></li>
                                                                <ul>
                                                                    <li><a href="claseVariabilePrimitiveByte.html">•Byte</a></li>
                                                                </ul>
                                                                <li><a href="clasVariabileReferinta.html">- Cu referință</a></li>
                                                                <ul>
                                                                    <li><a href="claseVariabileReferintaAutoBox_Unbox.html">•Autoboxing/Unboxing</a></li>
                                                                </ul>
                                                            </ul>
                                                            <li><h6><a href="classConstructor.html"><h6>Constructor</h6></a></h6></li>
                                                            <li><h6><a href="claseMetode.html"><h6>Metode</h6></a></h6></li>
                                                            <li><h6><a href="classImmutableClass.html"><h6>Clasa Imutabila</h6></a></h6></li>
                                                        </ul>
                                                    </div>
                                                    <div>
                                                        <h4>Cuvinte cheie</h4>
                                                            <ul>
                                                                <li><a href="javaCuvantCheieStatic.html">static</a></li>
                                                                <li><a href="javaCunvantCheieNULL.html">null</a></li>
                                                            </ul>
                                                        </div>
                                                </div>
                                            </div><!-- /cbp-hrsub -->
                                        </li>
                                        <li>
                                            <a href="OOPGeneralInfo.html">OOP</a>
                                            <div class="cbp-hrsub">
                                                <div class="cbp-hrsub-inner">
                                                    <div>
                                                        <h4><a href="OOPGeneralInfo.html"><h3 class="whiteTextOverride">Date generale</h3></a>
                                                        </h4>
                                                    </div>
                                                  
                                                    <div>
                                                        <h4>Data Structure</h4>
                                                        <ul>
                                                            <li><a href="OOPStrucDataStack.html">Stack</a></li>
                                                            <li><a href="#">Queque</a></li>
                                                            <li><a href="#">Heap</a></li>
                                                            <li><a href="OOPStrucDataHashTable.html">HashTable</a></li>
                                                            <li><a href="OOPStructDataRedBlackTree.html">Red and Black Tree</a></li>
                                                        </ul>
                                                    </div>
                                                    <div>
                                                        <h4><a href="OOPincapsulare.html"><h3 class="whiteTextOverride">Incapsulare</h3></a></h4>
                                                        <ul>
                                                          OOPIncapsulareModificators.html
                                                               <li><a href="OOPIncapsulareGetterSetter.html">Getter & Setter</a>
                                                               </li><li><a href="OOPIncapsulareModificators.html">Modificators</a></li>
                                                               
                                                              
                                                           </ul>
                                                    </div>
                                                    <div>
                                                           <h4><a href="OOPMostenire.html"><h3 class="whiteTextOverride">Mostenire</h3></a></h4>
                                                           <ul>
                                                          
                                                               <li><a href="OOPMostenireInterface.html">Interface</a></li>
                                                               <li><a href="OOPMostenireAbstract.html">clasa Abstracta</a></li>
                                                           </ul>
                                                    </div>
                                                </div><!-- /cbp-hrsub-inner -->
                                            </div><!-- /cbp-hrsub -->
                                        </li>
                                        <li>
                                            <a href="#">Collection</a>
                                                                <div class="cbp-hrsub">
                                                                    <div class="cbp-hrsub-inner">
                                                                        <div>
                                                                            <h4><a href="collection.html"><h3 class="whiteTextOverride">Collection</h3></a>
                                                                            </h4>
                                                                                    <ul>
                                                                                        <li><a href="collectionIterable.html">Iterable</a></li>
                                                                                        <ul>
                                                                                            <li><a href="#">PriorityQueque</a></li>
                                                                                        </ul>
                                                                                        <li><a href="collectionList.html">List</a></li>
                                                                                        <ul>
                                                                                            <li><a href="collectionListArrayList.html">ArrayList</a></li>
                                                                                            <li><a href="#">LinkedList</a></li>
                                                                                        </ul>
                                                                                        <li><a href="collectionSet.html">Set</a></li>
                                                                                        <ul>
                                                                                            <li><a href="collectionHashSet.html">HashSet</a></li>
                                                                                            <li><a href="#">LinkedHashSet</a></li>
                                                                                            <li><a href="#">TreeSet</a></li>
                                                                                            <li><a href="#">SoertedSet</a></li>
                                                                                            <li><a href="#">NavigableSet</a></li>
                                                                                        </ul>
                                                                                    </ul>
                                                                        </div>
                                            
                                                                    </div><!-- /cbp-hrsub-inner -->
                                                                </div><!-- /cbp-hrsub -->
                                                            </li>
                                                            <li>
                                            <a href="#">Interview</a>
                                            <div class="cbp-hrsub">
                                                <div class="cbp-hrsub-inner">
                                                    <div>
                                                        <h4><a href="interviewQuestion.html"><h3 class="whiteTextOverride">Questions</h3></a>
                                                        </h4>
                                                    </div>
                                                </div><!-- /cbp-hrsub-inner -->
                                            </div><!-- /cbp-hrsub -->
                                        </li>
                                        <li>
                                            <a href="#">Utilits</a>
                                             <div class="cbp-hrsub">
                                                 <div class="cbp-hrsub-inner">
                                                      <div>
                                                          <h4><h3 class="whiteTextOverride">String's</h3></a></h4>
                                                          <ul>
                                                             <li><a href="collectionIterable.html">Convert</a></li>
                                                                <ul>
                                                                    <li><a href="convertStringArrToList.html">Array to List</a></li>
                                                                </ul>
                                                                <li><a href="collectionList.html">List</a></li>
                                                                <ul>
                                                                    <li><a href="collectionListArrayList.html">ArrayList</a></li>
                                                                    <li><a href="#">LinkedList</a></li>
                                                                </ul>
                                                                <li><a href="collectionSet.html">Set</a></li>
                                                                <ul>
                                                                    <li><a href="collectionHashSet.html">HashSet</a></li>
                                                                    <li><a href="#">LinkedHashSet</a></li>
                                                                    <li><a href="#">TreeSet</a></li>
                                                                    <li><a href="#">SoertedSet</a></li>
                                                                    <li><a href="#">NavigableSet</a></li>
                                                                </ul>
                                                                </ul>
                                                        
                                                      </div>
                                                 </div><!-- /cbp-hrsub-inner -->
                                             </div><!-- /cbp-hrsub -->
                                        </li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
            """;

    static final String component = """
            <footer class="w3-content w3-padding-64 w3-text-grey w3-xlarge">
                           <a href="https://wakatime.com/@1c67ce54-d05a-440d-87af-38b7397cfd18"><img align="center"
                                                                                                     alt="Total time coded since Oct 13 2022"
                                                                                                     src="https://wakatime.com/badge/user/1c67ce54-d05a-440d-87af-38b7397cfd18.svg"/></a>
                       </footer>
                   
                       <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
                       <script src="js/cbpHorizontalMenu.min.js"></script>
                       <script>
                       			$(function() {
                       				cbpHorizontalMenu.init();
                       			});
                       </script>
                                   
                       </body>
                       </html>
            """;

    String componentTemplate = """
                       <img alt="" src="../../../../photo/interviewPractice/1.png" "> 
                       <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">Iterable</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                       """;
}
