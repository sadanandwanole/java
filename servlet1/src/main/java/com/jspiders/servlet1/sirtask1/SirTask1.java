package com.jspiders.servlet1.sirtask1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SirTask1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
				writer.println("<body style='background-color:black'>");
		writer.println(""
				+ "<div style='display: inline-block; background-image:url(https://assets.nflxext.com/ffe/siteui/vlv3/84526d58-475e-4e6f-9c81-d2d78ddce803/a76c1727-34da-4d80-99a3-69476e78860d/IN-en-20221228-popsignuptwoweeks-perspective_alpha_website_medium.jpg); opacity:0.9;background-repeat:no-repeat; background-size:cover;'>"
				+""
				+ "<style>\r\n"
				+ "    #div4{\r\n"
				+ "        display: flex;"
				+ "color:white"
				+ "margin:auto;"
				+ "margin-left:1200px \r\n"
				+ "    }\r\n"
				+ "</style>\r\n"
				+""
				+ "<div id=\"div4\">\r\n"
				+ ""
				+""
				+ "    <div> <select name=\"\" id=\"\" style=\"height: 38px; width: 78px  ; color:white ;background-color: rgb(46, 40, 40,0.4);\">\r\n"
				+ "        <option value=\"English\">English</option>\r\n"
				+ "        <option value=\"Hindi\">Hindi</option>\r\n"
				+ "    </select></div>\r\n"
				+ "    <div> <button style=\"background-color: red; height: 38px ; width: 78px; color:white ; \">sign in</button></div>\r\n"
				+ "</div>"
				+ "<h1 style='color:white; text-align:center; font-size:50px; margin: auto;\r\n"
				+ "           margin-top: 250px;'>Unlimited movies, TV shows </br> and more.</h1>"
//				+ "<button style='background-color: red; height: 38px ; width: 78px;'>sign in</button>"
				+ ""
				+ "<h3 style='color:white; text-align:center; font-size:28px; margin: auto;  margin-top: 30px; '>Watch anywhere. Cancel anytime.</h3>"
				+ "<h4  style='color:white; text-align:center; font-size:24px; margin: auto;  margin-top: 25px; '>Ready to watch? Enter your email to create or restart your membership.</h4>"
				+ "<style>\r\n"
				+ "    #div3{\r\n"
				+ "        display: inline-flex;"
				+ "\r\n"
				+ "    }\r\n"
				+ "</style>\r\n"
				+ "<div id=\"div3\">\r\n"
				+ "    <div><input type=\"text\" placeholder ='Email address' style=\"height: 55px; width: 500px ; margin: auto ; margin-top 20px; margin-left:350px;\"></div>\r\n"
				+ "    <div> <button  style=\"background-color: red; height: 55px; width: 200px;; \">Get Started ></button></div>\r\n"
				+ "   \r\n"
				+ "</div>"
//				+ "<h5>this is checkimg.....</h5>"
				+ "<style>div{padding:0.5; }</style>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</br>"
				+ "</div>");
		writer.println("<hr style=\"height: 8px; background-color: darkgray; margin: auto;  margin-top: 25px; \">");
		
		writer.println("<style>\r\n"
				+ "    #divparent{\r\n"
				+ "        display: inline-flex ;\r\n"
				+ "        text-align: center;"
				+ "color:white\r\n"
				+ "    }\r\n"
				+ "</style>\r\n"
				+ "    <div id=\"divparent\" style=\" background-color: black; text-align:center\">\r\n"
				+ "        <div>\r\n"
				+ "            <h1 style=\"height: 50px ;width: 400px; color:azure\">Enjoy on your TV.</h1>\r\n"
				+ "            <h3 style=\"height: 50px ;width: 400px;\">Watch on smart TVs, PlayStation, Xbox, Chromecast, Apple TV, Blu-ray players and more.</h3>\r\n"
				+ "        </div>\r\n"
				+ "        <div>\r\n"
				+ "            <img src=\"https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/tv.png\" alt=\"\" style=\"margin-left: 600px; height: 300px; width: 300px;;\">\r\n"
				+ "        </div>\r\n"
				+ "    </div>\r\n"
				+ "");
		writer.println("<hr style=\"height: 8px; background-color: darkgray; margin: auto;  margin-top: 25px; \">");
		
		
		writer.println("<style>\r\n"
				+ "    #divparent1{\r\n"
				+ "        display: inline-flex ;\r\n"
				+ "        text-align: center;"
				+ "color:white\r\n"
				+ "    }\r\n"
				+ "</style>\r\n"
				+ "    <div id=\"divparent1\" style=\" background-color: black; text-align:center\">"
				+ " <div style='width:900px'>     "
				+ "<img src=\"https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/mobile-0819.jpg\" alt=\"\" style='margin-left: 10px; height: 300px; width: 300px;'>"
				+ "       </div>"
				
				+ "        <div>\r\n"
				+ "            <h1 style=\"text-align: center; height: 50px ;width: 400px; color:azure\">Download your shows to watch offline.</h1>\r\n"
				+ "            <h3 style=\"text-align: center; height: 50px ;width: 400px;\">Save your favourites easily and always have something to watch.</h3>\r\n"
				+ "        </div>\r\n"
				+ "    </div>\r\n"
				+ "");
		
writer.println("<hr style=\"height: 8px; background-color: darkgray; margin: auto;  margin-top: 25px; \">");
		
		writer.println("<style>\r\n"
				+ "    #divparent2{\r\n"
				+ "        display: inline-flex ;\r\n"
				+ "        text-align: center;"
				+ "color:white\r\n"
				+ "    }\r\n"
				+ "</style>\r\n"
				+ "    <div id=\"divparent2\" style=\" background-color: black; text-align:center\">\r\n"
				+ "        <div>\r\n"
				+ "            <h1 style=\"height: 50px ;width: 400px; color:azure\">Watch everywhere..</h1>\r\n"
				+ "            <h3 style=\"height: 50px ;width: 400px;\">Stream unlimited movies and TV shows on your phone, tablet, laptop, and TV.</h3>\r\n"
				+ "        </div>\r\n"
				+ "        <div>\r\n"
				+ "            <img src=\"https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/device-pile-in.png\"  style=\"margin-left: 600px; height: 300px; width: 300px;;\">\r\n"
				+ "        </div>\r\n"
				+ "    </div>\r\n"
				+ "");
		
		
		
writer.println("<hr style=\"height: 8px; background-color: darkgray; margin: auto;  margin-top: 25px; \">");
		
		
		writer.println("<style>\r\n"
				+ "    #divparent1{\r\n"
				+ "        display: inline-flex ;\r\n"
				+ "        text-align: center;"
				+ "color:white\r\n"
				+ "    }\r\n"
				+ "</style>\r\n"
				+ "    <div id=\"divparent1\" style=\" background-color: black; text-align:center\">"
				+ " <div style='width:900px'>     "
				+ " <img src=\"https://occ-0-4995-2186.1.nflxso.net/dnm/api/v6/19OhWN2dO19C9txTON9tvTFtefw/AAAABYjXrxZKtrzxQRVQNn2aIByoomnlbXmJ-uBy7du8a5Si3xqIsgerTlwJZG1vMpqer2kvcILy0UJQnjfRUQ5cEr7gQlYqXfxUg7bz.png?r=420\" style='margin-left: 10px; height: 300px; width: 300px;'>"
				+ "       </div>"
				
				+ "        <div>\r\n"
				+ "            <h1 style=\"text-align: center; height: 50px ;width: 400px; color:azure\">Create profiles for children.</h1>\r\n"
				+ "            <h3 style=\"text-align: center; height: 50px ;width: 400px;\">Send children on adventures with their favourite characters in a space made just for them—free with your membership.</h3>\r\n"
				+ "        </div>\r\n"
				+ "    </div>\r\n"
				+ "");
		writer.println("<hr style=\"height: 8px; background-color: darkgray; margin: auto;  margin-top: 25px; \">");
		writer.println("<div style=\"padding: 10px; margin: 10px; margin: auto; margin-left: 200px; color:white; font-size\">\r\n"
				+ "    <h1>Frequently Asked Questions</h1>\r\n"
				+ "    <div style=\" margin: 10px; background-color: darkgray; height: 40px ; width: 800px; border: 1px solid ;font-size:30px; \">what is netflix?</div>\r\n"
				+ "    <div style=\" margin: 10px; background-color: darkgray; height: 40px ; width: 800px; border: 1px solid; font-size:30px; \">How much does Netflix cost?</div>\r\n"
				+ "    <div style=\"  margin: 10px; background-color: darkgray; height: 40px ; width: 800px; border: 1px solid; font-size:30px; \">How do I cancel?</div>\r\n"
				+ "    <div style=\" margin: 10px; background-color: darkgray; height: 40px ; width: 800px; border: 1px solid; font-size:30px; \">What can I watch on Netflix?</div>\r\n"
				+ "    <div style=\" margin: 10px; background-color: darkgray; height: 40px ; width: 800px; border: 1px solid; font-size:30px; \">Is Netflix good for kids?</div>\r\n"
				+ "<h3>Ready to watch? Enter your email to create or restart your membership.</h3>"
				+"<style>\r\n"
				+ "    #div3{\r\n"
				+ "        display: inline-flex;\r\n"
				+ "        align-items: center;\r\n"
				+ "    }\r\n"
				+ "</style>\r\n"
				+ "<div id=\"div3\">\r\n"
				+ "    <div><input type=\"text\" placeholder ='Email address' style=\"height: 55px; width: 500px ; margin: auto margin-top 20px; margin-left:280p;\"></div>\r\n"
				+ "    <div> <button  style=\"background-color: red; height: 55px; width: 200px;\">Get Started ></button></div>\r\n"
				+ "   \r\n"
				+ "</div>"
				+ "</div>\r\n"
				+ "'</body>");
		
		
	}
}
