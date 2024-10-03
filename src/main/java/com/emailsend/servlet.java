package com.emailsend ;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/Servlet")
public class servlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String name = request.getParameter("Text") ;
        String subject =request.getParameter("subject") ;
        String mail =request.getParameter("email") ;
        String message ="Name :" +name+"\n" +"Email : "+mail+"\n"+request.getParameter("message") ;
        String to ="naveendhakad7999@gmail.com" ;
        String from ="naveendhakad489@gmail.com" ;
        org.emailsend.App.sendMessage(message,subject,to,from); ;
        String messagetouser ="Thank you for visiting my website" ;
        String subjecttouser = "Naveen Dhakad portfolio " ;

        org.emailsend.App.sendMessage(messagetouser,subjecttouser,mail,from); ;
        response.getWriter().write("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Portfolio</title>\n" +
                "    <link rel=\"stylesheet\" href=\"style.css\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\n" +
                "    <style>\n" +
                "      /* Style for the modal background */\n" +
                "      .modal {\n" +
                "          display: block; /* Show the modal */\n" +
                "          position: fixed;\n" +
                "          z-index: 1;\n" +
                "          padding-top: 100px;\n" +
                "          left: 0;\n" +
                "          top: 0;\n" +
                "          width: 100%;\n" +
                "          height: 100%;\n" +
                "          overflow: auto;\n" +
                "          background-color: rgba(0,0,0,0.7); /* Black background with opacity */\n" +
                "      }\n" +
                "\n" +
                "      /* Style for the modal content */\n" +
                "      .modal-content {\n" +
                "          background-color: #fefefe;\n" +
                "          margin: auto;\n" +
                "          padding: 20px;\n" +
                "          border: 1px solid #888;\n" +
                "          width: 80%;\n" +
                "          position: relative;\n" +
                "      }\n" +
                "\n" +
                "      /* The close button */\n" +
                "      .close {\n" +
                "          color: #aaa;\n" +
                "          float: right;\n" +
                "          font-size: 28px;\n" +
                "          font-weight: bold;\n" +
                "      }\n" +
                "\n" +
                "      .close:hover,\n" +
                "      .close:focus {\n" +
                "          color: black;\n" +
                "          text-decoration: none;\n" +
                "          cursor: pointer;\n" +
                "      }\n" +
                "  </style>\n" +
                "\n" +
                "  </head>\n" +
                "<body>\n" +
                "<header>\n" +
                "    <nav>\n" +
                "        <ul>\n" +
                "            <li><a href=\"index.html\">Home</a></li>\n" +
                "            <li><a href=\"#\">About</a></li>\n" +
                "            <li><a href=\"#\">Services</a></li>\n" +
                "            <li><a href=\"#\">Skills</a></li>\n" +
                "            <li><a href=\"#\">Project</a></li>\n" +
                "            <li><a href=\"#\">Contact</a></li>\n" +
                "        </ul>\n" +
                "    </nav>\n" +
                "</header>\n" +
                "\n" +
                "<section class=\"intro\">\n" +
                "    <div class=\"intro-text\">\n" +
                "        <h1>Hello, It's Me<br><span>Naveen Dhakad</span><br>And I'm a <span class=\"typing-animation\">Java Developer</span></h1>\n" +
                "        <p>I'm a Software Developer  My expertise is in creating and designing Software, Backend design, and much more....</p>\n" +
                "        <div class=\"social-links\">\n" +
                "            <a href=\"https://wa.me/qr/YNITYWKGMTYJE1\"><i class=\"fab fa-whatsapp\"></i></a>\n" +
                "            <a href=\"https://www.instagram.com/its_dhakadshabb?igsh=dDU4ZThmaThoanl2\"><i class=\"fab fa-instagram\"></i></a>\n" +
                "            <a href=\"https://github.com/NaveenDhakad\"><i class=\"fa-brands fa-github\"></i></a>\n" +
                "            <a href=\"https://www.linkedin.com/in/naveen-dhakad-548b70255?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app\"><i class=\"fab fa-linkedin-in\"></i></a>\n" +
                "        </div>\n" +
                "        <a href=\"#\" class=\"btn btn-primary btn-shadow\">Download CV</a>\n" +
                "    </div>\n" +
                "    <div class=\"intro-image\">\n" +
                "        <img src=\"images/Naveen.jpg\" alt=\"Naveen Dhakad\">\n" +
                "    </div>\n" +
                "</section>\n" +
                "\n" +
                "<section class=\"about\" id=\"about\">\n" +
                "    <div class=\"about-image\">\n" +
                "        <img src=\"images/Naveen.jpg\" alt=\"Naveen Dhakad\">\n" +
                "    </div>\n" +
                "    <div class=\"about-text\">\n" +
                "        <h2>About <span>Me</span></h2>\n" +
                "        <h3>Software Developer!</h3>\n" +
                "        <p>\n" +
                "            I am a skilled web designer with over 3 years of experience in the industry.\n" +
                "            My passion lies in creating captivating website designs and implementing them\n" +
                "            through frontend development. I take pride in staying up-to-date with current\n" +
                "            design trends and leveraging my creativity to produce visually appealing and\n" +
                "            user-friendly websites. Throughout my career, I have developed a deep understanding\n" +
                "            of user experience (UX) and user interface (UI) principles...\n" +
                "        </p>\n" +
                "        <a href=\"#\" class=\"btn\">More About Me</a>\n" +
                "    </div>\n" +
                "</section>\n" +
                "\n" +
                "<section class=\"services\" id=\"services\">\n" +
                "    <h2>My <span>Services</span></h2>\n" +
                "    <div class=\"services-container\">\n" +
                "        <div class=\"service-box\">\n" +
                "            <div class=\"service-icon\">⚙\uFE0F</div>\n" +
                "            <h3>UI/UX Design</h3>\n" +
                "            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Pariatur possimus voluptate.</p>\n" +
                "            <a href=\"#\" class=\"btn\">learn more</a>\n" +
                "        </div>\n" +
                "        <div class=\"service-box\">\n" +
                "            <div class=\"service-icon\">\uD83D\uDCBB</div>\n" +
                "            <h3>Web Design</h3>\n" +
                "            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Pariatur possimus voluptate.</p>\n" +
                "            <a href=\"#\" class=\"btn\">learn more</a>\n" +
                "        </div>\n" +
                "        <div class=\"service-box\">\n" +
                "            <div class=\"service-icon\">\uD83D\uDCF1</div>\n" +
                "            <h3>App Design</h3>\n" +
                "            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Pariatur possimus voluptate.</p>\n" +
                "            <a href=\"#\" class=\"btn\">learn more</a>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</section>\n" +
                "\n" +
                "<div class=\"skills-section\">\n" +
                "    <h2>Technical Skills</h2>\n" +
                "    <div class=\"skill-bar\">\n" +
                "        <p>HTML</p>\n" +
                "        <div class=\"progress\">\n" +
                "            <div class=\"progress-done\" data-done=\"20\"></div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"skill-bar\">\n" +
                "        <p>CSS</p>\n" +
                "        <div class=\"progress\">\n" +
                "            <div class=\"progress-done\" data-done=\"60\"></div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"skill-bar\">\n" +
                "        <p>Javascript</p>\n" +
                "        <div class=\"progress\">\n" +
                "            <div class=\"progress-done\" data-done=\"10\"></div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"skill-bar\">\n" +
                "        <p>Java</p>\n" +
                "        <div class=\"progress\">\n" +
                "            <div class=\"progress-done\" data-done=\"80\"></div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"skill-bar\">\n" +
                "        <p>C++</p>\n" +
                "        <div class=\"progress\">\n" +
                "            <div class=\"progress-done\" data-done=\"50\"></div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <h2>Professional Skills</h2>\n" +
                "    <div class=\"circular-skills\">\n" +
                "        <div class=\"circle\" data-percent=\"90\">\n" +
                "            <div class=\"inner-circle\">90%</div>\n" +
                "            <p>Creativity</p>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"circle\" data-percent=\"65\">\n" +
                "            <div class=\"inner-circle\">65%</div>\n" +
                "            <p>Communication</p>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"circle\" data-percent=\"75\">\n" +
                "            <div class=\"inner-circle\">75%</div>\n" +
                "            <p>Problem Solving</p>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"circle\" data-percent=\"85\">\n" +
                "            <div class=\"inner-circle\">85%</div>\n" +
                "            <p>Teamwork</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"projects-section\">\n" +
                "    <h2>Latest <span>Project</span></h2>\n" +
                "    <div class=\"projects-container\">\n" +
                "        <div class=\"project-card\">\n" +
                "            <img src=\"https://media.geeksforgeeks.org/img-practice/prod/courses/345/Web/Content/javasc_1724254497.webp\" alt=\"Project 1\">\n" +
                "        </div>\n" +
                "        <div class=\"project-card\">\n" +
                "            <img src=\"https://media.geeksforgeeks.org/auth-dashboard-uploads/three90-rightbanner-20240708.png\" alt=\"Project 2\">\n" +
                "        </div>\n" +
                "        <div class=\"project-card\">\n" +
                "            <a href=\"https://naveendhakad.github.io/Ips-Gallary/\"><img src=\"https://media.geeksforgeeks.org/img-practice/prod/courses/241/Web/Content/FSRNL_1705410152.webp\" alt=\"Project 3\"></a>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>\n" +
                "\n" +
                "<section class=\"contact\" id=\"contact\">\n" +
                "    <div class=\"contact-content\">\n" +
                "        <div class=\"contact-info\">\n" +
                "            <h2>Contact <span>Me</span></h2>\n" +
                "            <p>Let's Work Together</p>\n" +
                "            <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Dolorum nobis possimus tenetur quidem fugit?</p>\n" +
                "            <p><strong>Email:</strong>Naveendhakad7999@gmail.com</p>\n" +
                "            <p><strong>Phone:</strong>7999365433</p>\n" +
                "            <div class=\"social-links\">\n" +
                "                <a href=\"https://wa.me/qr/YNITYWKGMTYJE1\"><i class=\"fab fa-whatsapp\"></i></a>\n" +
                "                <a href=\"https://www.instagram.com/its_dhakadshabb?igsh=dDU4ZThmaThoanl2\"><i class=\"fab fa-instagram\"></i></a>\n" +
                "                <a href=\"https://github.com/NaveenDhakad\"><i class=\"fa-brands fa-github\"></i></a>\n" +
                "                <a href=\"https://www.linkedin.com/in/naveen-dhakad-548b70255?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app\"><i class=\"fab fa-linkedin-in\"></i></a>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div class=\"contact-form\">\n" +
                "            <form action=\"Servlet\" method=\"post\">\n" +
                "                <input type=\"text\" name =\"Text\" placeholder=\"Enter Your Name\" required>\n" +
                "                <input type=\"email\" name =\"email\" placeholder=\"Enter Your Email\" required>\n" +
                "                <input type=\"text\" name=\"subject\" placeholder=\"Enter Your Subject\" required>\n" +
                "                <textarea name =\"message\" placeholder=\"Enter Your Message\" required></textarea>\n" +
                "                <button type=\"submit\" class=\"btn\">Submit</button>\n" +
                "            </form>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</section>\n" +
                " <div id=\"myModal\" class=\"modal\">" +
                " <div class=\"modal-content\"> "+
                "   <span class=\"close\">&times;</span>"+
                "  <p style=\"color: Black ; \">Thank you for your response</p>"+
                " </div>"+
                "</div>"+

                "<script type=\"text/javascript\">\n" +
                "  // Get the modal\n" +
                "  var modal = document.getElementById(\"myModal\");\n" +
                "\n" +
                "  // Get the close button\n" +
                "  var closeBtn = document.getElementsByClassName(\"close\")[0];\n" +
                "\n" +
                "  // Close the modal when the close button is clicked\n" +
                "  closeBtn.onclick = function() {\n" +
                "      modal.style.display = \"none\";\n" +
                "  }\n" +
                "\n" +
                "  // Close the modal when clicking anywhere outside the modal content\n" +
                "  window.onclick = function(event) {\n" +
                "      if (event.target == modal) {\n" +
                "          modal.style.display = \"none\";\n" +
                "      }\n" +
                "  }\n" +
                "</script>\n" +
                "<script src=\"script.js\"></script>\n" +
                "</body>\n" +
                "</html>\n");


    }

}
