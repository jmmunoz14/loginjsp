<%
    HttpSession objsesion = request.getSession(false);
    String usuario = (String) objsesion.getAttribute("usuario");
    if(usuario.equals(""))
    {
        response.sendRedirect("index.jsp");
    }
%>

<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<style>
* {box-sizing: border-box}
body {
font-family: Verdana, 
sans-serif; 
margin:0
}

.mySlides img {
height: 400px;
width: 1000px;

}

img {vertical-align: middle;}

/* Slideshow container */
.slideshow-container {
  max-width: 40%;
  position: relative;
  margin: auto;
}

/* Next & previous buttons */
.prev, .next {
  cursor: pointer;
  position: absolute;
  top: 50%;
  width: auto;
  padding: 16px;
  margin-top: -22px;
  color: white;
  font-weight: bold;
  font-size: 18px;
  transition: 0.6s ease;
  border-radius: 0 3px 3px 0;
}

/* Position the "next button" to the right */
.next {
  right: 0;
  border-radius: 3px 0 0 3px;
}

/* On hover, add a black background color with a little bit see-through */
.prev:hover, .next:hover {
  background-color: rgba(0,0,0,0.8);
}

/* Caption text */
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

/* The dots/bullets/indicators */
.dot {
  cursor: pointer;
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active, .dot:hover {
  background-color: #717171;
}

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

/* On smaller screens, decrease text size */
@media only screen and (max-width: 300px) {
  .prev, .next,.text {font-size: 11px}
}

iframe {    
    display: block;
	margin-left: auto;
	margin-right: auto;
	width: 50%;
	height: 400px;
}

.clear {    
    clear:both;    
}


* { box-sizing: border-box; }
.video-background {
  background: #000;
  position: fixed;
  top: 0; right: 0; bottom: 0; left: 0;
  z-index: -99;
}
.video-foreground,
.video-background iframe {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  pointer-events: none;
}
#vidtop-content {
	top: 0;
	color: #fff;
}
.vid-info { position: absolute; top: 0; right: 0; width: 33%; background: rgba(0,0,0,0.3); color: #fff; padding: 1rem; font-family: Avenir, Helvetica, sans-serif; }
.vid-info h1 { font-size: 2rem; font-weight: 700; margin-top: 0; line-height: 1.2; }
.vid-info a { display: block; color: #fff; text-decoration: none; background: rgba(0,0,0,0.5); transition: .6s background; border-bottom: none; margin: 1rem auto; text-align: center; }
@media (min-aspect-ratio: 16/9) {
  .video-foreground { height: 300%; top: -100%; }
}
@media (max-aspect-ratio: 16/9) {
  .video-foreground { width: 300%; left: -100%; }
}
@media all and (max-width: 600px) {
.vid-info { width: 50%; padding: .5rem; }
.vid-info h1 { margin-bottom: .2rem; }
}
@media all and (max-width: 500px) {
.vid-info .acronym { display: none; }



}
</style>
</head>
<body>
<nav class="w3-bar w3-black">
  <a href="index.jsp" class="w3-button w3-bar-item">Inicio</a>
  <a href="Registrarse.jsp" class="w3-button w3-bar-item">Registrarse</a>
  <a href="ingresar.jsp" class="w3-button w3-bar-item">Ingresar</a>
  <a href="#contacto" class="w3-button w3-bar-item">Contacto</a>
  <% out.println("Bienvenido " + usuario);  %>
</nav>



<section class="w3-container w3-center" >
  <h2 class="w3-wide" style= "color:white">Financial Coach</h2>
  <p class="w3-opacity"style= "color:white"><i>Tu bolsillo, nuestra preocupación</i></p>
</section>

<section class="w3-container w3-center" >
 
  <h1 class="w3-wide"style= "color:white"><i>¿ En que consiste Financial Coach ?</i></h1>
</section>
<div>

<iframe width="480" height="277" src="https://www.youtube.com/embed/OmY4t4N7tVo" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>

</div>
<div class="video-background">
    <div class="video-foreground">
      <iframe src="https://www.youtube.com/embed/W0LHTWG-UmQ?controls=0&showinfo=0&rel=0&autoplay=1&loop=1&playlist=W0LHTWG-UmQ" frameborder="0" allowfullscreen></iframe>

    </div>
</div>


</body>
</html> 
