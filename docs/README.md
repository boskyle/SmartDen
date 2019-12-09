<h1>Introduction</h1><br>
<img src ="ceng317_readMe_images/system_diagram.jpeg" alt="sys_diag_image"> <br>
	
<h1>Bill of Materials/Budget</h1><br>
	<!-- Bill of components here (individual or package?)-->
<p>The materials came with a kit I had previously bought prior to this course.</p>
<img src = "proof_of_purchase.JPG" alt="kit1"> <br>
<br><p>If you want to buy the parts individually then: <br>

Modules 	  | Unit Price $(CAD) | Total Cost | Link |
------------- | -------------| -------------| -------------|
Arduino Uno R3 | 26.99 | | <a href="https://www.robotshop.com/ca/en/arduino-uno-r3-usb-microcontroller.html?gclid=CjwKCAiA8qLvBRAbEiwAE_ZzPcuDfbbajj1NVcvjjOGzziY92sE-PeEQv9CsHTed9Sek-rWy40W3QBoCD2sQAvD_BwE">BUY</a>
Temperate and Humidity Sensor (DHT-11)| 5.19| | <a href="https://www.robotshop.com/ca/en/dht11-temperature-humidity-sensor-module.html">BUY</a>
Distance Sensor (HC-SR04) | 6.55 | 38.73 |  <a href="https://www.robotshop.com/ca/en/hc-sr04-ultrasonic-range-finder-osepp.html">BUY</a>

			
</p>

<h1>Time Commitment</h1><br>
	<!--Time expected to finis this?-->

Tasks | Time Expected to finish | 
--- | --- | 
Breadboard Connection + Testing Modules Readings with Arduino IDE | 1-2 hours |
PCB Soldering | 4-6 hours |
PCB Power Up | 30 minutes - 1 hour |
Arduino and PCB Case Made | 1 hour |





<h1>Mechanical Assembly</h1><br>
<p>Follow the breadbord connection to test if each sensors are working properly.</p>
<P>Use these source codes to the each hardware modules respectively and upload them to the arduino using Arduino IDE:</p><br>

<b>Arduino IDE download</b>:<a href="https://www.arduino.cc/en/main/software"> CLICK HERE</a> <br>
<b>dht-11 (temp & humidity sensor) source code</b>:<a href="https://github.com/boskyle/SmartDen/blob/master/docs/ceng317_week8/dht_11_sketch.ino"> CODE</a>

<b>hc-sr04 (distance sensor) source code</b>:<a href="https://github.com/boskyle/SmartDen/blob/master/docs/ceng317_week8/dht_11_sketch.ino"> CODE</a>


<img src="breadboard.JPG" alt="bb_image_fzz" width="600px" height="300px"> 
<img src="ceng317_week8/breadboard_connection.jpg" alt="bb_actual" width="600px" height="300px"> <br>

<p>Sensors readings connected with the breadboard should look like this:</p><br>
<b>DHT-11 Readings: </b>
<img src ="ceng317_week8/dht_11_output.JPG" alt="bb_dht_readings">

<b>HC-SR04 Readings: </b>
<img src ="ceng317_week8/hc_sr04_output.JPG" alt="bb_hc-sr04_readings">

<br>


<h1>PCB/Soldering</h1><br>
<p>Download the fritzing file here: <a href="https://github.com/boskyle/SmartDen/blob/master/documentation/CENG317_PCB_DESIGN.fzz">(Design File)</a> so you can get it printed.<br>
<strong>PCB Software to open the file:</strong> <a href="https://fritzing.org/">CLICK_HERE</a><br>
You will need 2x four pin headers so that your hardware modules can be inserted. <br>
- The pins of both headers would be sticking out to the bottom layer and the headers should be to the top layer.<br>
- See the picture below for reference.
</p> <br>
<p><strong>PCB Design:</strong></p>
<img src="pcb.JPG" alt="pcb_design_img" width="500px" height="500px">
<p><strong>Top Layer:</strong><br></p>
<img src="ceng317_readMe_images/top_layer.jpeg" width="500px" height="500px">
<p><strong>Bottom Layer:</strong></p>
<img src="ceng317_readMe_images/bottom_layer.jpeg" width="500px" height="500px"> <br>
<p><strong>Attached to the Arduino Uno R3:</strong></p>
<img src="ceng317_readMe_images/attached.jpeg" width="500px" height="500px"><br>

<h1>Power Up</h1><br>
<img src="ceng317_readMe_images/power_up2.jpeg" width="500px" height="500px"><br>
<img src="ceng317_readMe_images/power_up.jpeg" width="500px" height="500px"><br>

<h1>Unit Testing</h1><br>
<img src="ceng317_readMe_images/power_up2.jpeg" width="500px" height="500px"><br>
<p>Test each hardware units when connected to your PCB if they are working properly: </p><br>
<b>DHT-11 Readings: </b>
<img src ="unit_testing_dht-11.JPG" alt="pcb_dht_readings">
<b>HC-SR04 Readings: </b>
<img src="unit_testing_hc-sr04.JPG" alt="pcb_hc-sr04_readings"><br>

<h1>Production Testing </h1><br>



<b>You can laser cut the same case as mine:</b> <a href="https://github.com/boskyle/SmartDen/blob/master/documentation/boswell2.cdr">case file</a><br>OR
<br>
<b>Make your own.</b><br>
<img src="ceng317_week11/enc_3.jpg" alt="inside_case" width="300px" height="500px"><br>

<p> Test hardware units with enclosure: </p><br>
<img src="ceng317_week11/enc_1.jpg" alt="inside_case" width="300px" height="500px"><br>

<b>DHT-11 Readings: </b>
<img src ="production_testing_dht-11.JPG" alt="pcb_dht_readings">
<b>HC-SR04 Readings: </b>
<img src="production_testing_hc-sr04.JPG" alt="pcb_hc-sr04_readings"><br>