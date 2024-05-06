<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Pagina Web</title>
	<link rel="stylesheet" type="text/css" href="css/stylesheet.css"/>
</head>
<body>
<!--Inizio Header-->
<header id="header">
	<nav>
		<ul class="nav">
			<li class="searchbar">
				<!--Form per la ricerca-->
				<form name="searchForm" method="get">
					<!--Immagine per il submit, va a sinistra del textbox-->
					<label></label>
					<input type="image" id="submit" src="images/lente.png" alt="Clicca qui per per cercare">
					<!--Textbox per ricerca-->
					<label></label>
					<input type="text" id="search" name="search" value="" maxlength="50" required placeholder="Cerca . . ." size="50"/>
				</form>
			</li>
			<li class="items">
				<!--Link a bottone-->
				<ul class="filtri">
					<li><a id="btnFiltri" class="button" href="filtri.html">Filtri</a></li>
				</ul>
				<ul class="itemlist">
					<!--Filtri è vicino al textbox, gli altri sono raggruppati a sinistra-->
					<li><a id="btn_Iscriviti" class="button" href="iscriviti.html">Iscriviti</a></li>
					<li><a id="btn_Accedi"  class="button" href="accedi.html">Accedi</a></li>
				</ul>
			</li>
		</ul>
	</nav>
</header>
<!--Fine Header-->
<!--Inizio Main-->
<main id="main" class="clearfix">
	<!--Immagine principale-->
	<div id="box_banner">
		<img id="banner" src="images/banner.jpg" alt="Banner dell'evento">
	</div>

	<!--Colonna sinistra-->
	<section id="colonna_sx">
		<h1>Nome evento</h1>
		<p id="descrizione" class="description">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
		<br>
		<br>
		<h2>Data e ora</h2>
		<p id="data" class="description">Lun, 1 Gen 2024 09:00 - 13:00 CET</p>
		<br>
		<br>
		<h2>Location</h2>
		<a id="location" class="description" href="mappa.html">Via Giuseppe Saragat, 1, 44124 Ferrara FE</a>
		<br>
		<br>
		<br>
		<h2>Organizzato da</h2>
		<a id="organizzatore" class="description" href="profilo_org.html">Dr Nerina Ramlakhan</a>
		<br>
		<br>
		<br>
		<h2>Infromazioni sull'evento</h2>
		<p id="info" class="info">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>

		<!--Immagine secondaria-->
		<div id="box_imm2">
			<img id="imm2" src="images/imm2.jpg" alt="Immagine secondaria">
		</div>
		<br>
		<a id="segnala" href="segnala.html">Segnala questo evento</a>
	</section>

	<!--Colonna destra-->
	<aside id="colonna_dx">
		<!--Box con prezzo e link biglietteria-->
		<div id="box_bigl">
			<h2 id="prezzo">9 - 18€</h2>
			<div id="btn_biglietteria">
				<a href="biglietteria.html">COMPRA ORA</a>
			</div>
		</div>

		<!--Link vari-->
		<nav id="nav_dx">
			<ul>
				<li>
					<ul class="link_dx">
						<li><p id="btn_segui" class="buttondx">Segui</p></li>
						<li class="chat_live"><a id="btn_chat" class="buttondx" href="chat.html">Chat</a></li>
						<li class="chat_live"><a id="btn_live" class="buttondx" href="live.html">Live</a></li>
					</ul>
				</li>
				<li id="btn_recensioni"><a class="buttondx" href="recensioni.html">Recensioni</a></li>
				<li id="btn_sondaggiPre"><a class="buttondx" href="/api/sondaggioPre">Sondaggio pre-evento</a></li>
				<li id="btn_sondaggiPost"><a class="buttondx" href="/api/sondaggioPost">Sondaggio post-evento</a></li>
			</ul>
		</nav>

		<div id="videoPlayer"></div>
		<script>
			fetch('/api/videoTrailer')
					.then(response => response.text())
					.then(videoUrl => {
						// Costruisce l'iframe per incorporare il video
						var iframe = document.createElement('iframe');
						iframe.width = '560';
						iframe.height = '315';
						iframe.src = videoUrl;
						iframe.frameborder = '0';
						iframe.allowfullscreen = true;

						// Aggiunge al div 'videoPlayer'
						document.getElementById('videoPlayer').appendChild(iframe);
					})
					.catch(error => {
						console.error('Si è verificato un errore:', error);
					});
		</script>
	</aside>

	<!--Link a inizio pagina-->
	<div id="torna_su">
		<a href="#header"><img id="freccia" src="images/freccia.jpg" alt="Clicca qui per tornare in cima alla pagina"></a>
	</div>
</main>
<!--Fine Main-->
<!--Inizio Footer-->
<footer>
	<!--Link da raggruppare in 3 gruppi da 3-->
	<!--Prima colonna-->
	<nav class="footer-nav">
		<ul class="prima_colonna">
			<li><a href="home.html">Home Page</a></li>
			<li><a href="faq.html">FAQs</a></li>
			<li><a href="sponsor.html">Sponsorizzazioni</a></li>
		</ul>
		<!--Seconda colonna-->
		<ul class="seconda_colonna">
			<li><a href="user_sup.html">Supporto utente</a></li>
			<li><a href="tec_sup.html">Supporto tecnico</a></li>
			<li><a href="segnala.html">Segnala questo evento</a></li>
		</ul>
		<!--Terza colonna-->
		<ul class="terza_colonna">
			<li><a href="privacy.html">Privacy</a></li>
			<li> <a href="cookies.html">Cookies</a></li>
			<li><a href="terms.html">Termini di utilizzo</a></li>
		</ul>
	</nav>
</footer>
<!--Fine Footer-->
</body>
</html>