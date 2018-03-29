<%@page language="java" pageEncoding="UTF-8"%>
<%@ page import="dev.sgp.entite.Collaborateur"%>
<%@ page import="java.util.List"%>
<%@ page import="dev.sgp.util.Constantes"%>
<!DOCTYPE html>
<html lang="fr">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Creer collab</title>
<script>
	// Example starter JavaScript for disabling form submissions if there are invalid fields
	(function() {
		'use strict';
		window.addEventListener('load', function() {
			// Fetch all the forms we want to apply custom Bootstrap validation styles to
			var forms = document.getElementsByClassName('needs-validation');
			// Loop over them and prevent submission
			var validation = Array.prototype.filter.call(forms, function(form) {
				// si l'ur est creer-collab.html?errors 
				if (window.location.search == "?errors") {
					form.classList.add('was-validated');
				}
				form.addEventListener('submit', function(event) {
					if (form.checkValidity() === false) {
						event.preventDefault();
						event.stopPropagation();
					}
					form.classList.add('was-validated');
				}, false);
			});
		}, false);
	})();
</script>
</head>

<body>
	<header>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<img class="navbar-brand"  src="<%=request.getContextPath()%>/img/sing.ico" class="rounded ">
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="flase" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="lister">Collaborateurs
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="./stats.html">Statistiques</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="./activités.html">Activités</a></li>
				</ul>
			</div>
		</nav>
	</header>
	<div class="row">
		<div class="col-3 offset-1">
			<h2>Nouveau collaborateur</h2>
		</div>
	</div>
	<div class="col-12 offset-2 mt-5">
		<form class="needs-validation" method="POST" action="creer" novalidate>
			<div class="form-group row">
				<label for="input-nom" class="col-sm-2 col-form-label">Nom :</label>
				<div class="col-sm-4">
					<input name="nom" type="text" class="form-control" id="nom"
						placeholder="Nom" required>
					<div class="invalid-feedback">Le nom est obligatoire.</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="input-prenom" class="col-sm-2 col-form-label">Prénom
					:</label>
				<div class="col-sm-4">
					<input name="prenom" type="text" class="form-control" id="prenom"
						placeholder="Prénom" required>
					<div class="invalid-feedback">Le prénom est obligatoire.</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="colFormLabel" class="col-sm-2 col-form-label">Date
					de naissance :</label>
				<div class="col-sm-4">
					<input name="dateNaissance" type="date" class="form-control"
						id="dateNaissance" placeholder="dd/mm/YYYY" required>
					<div class="invalid-feedback">La date de naissance est
						obligatoire.</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="colFormLabel" class="col-sm-2 col-form-label">Adresse
					:</label>
				<div class="col-sm-4">
					<textarea name="adresse" class="form-control" id="adresse" rows="3"
						placeholder="Adresse" required></textarea>
					<div class="invalid-feedback">L"adresse est obligatoire.</div>
				</div>
			</div>
			<div class="form-group row">
				<label name="numeroSocial" for="colFormLabel"
					class="col-sm-2 col-form-label">Numéro de sécurité sociale
					:</label>
				<div class="col-sm-4">
					<input name="secu" type="text" class="form-control" id="secu"
						placeholder="N° secu" required>
					<div class="invalid-feedback">Le numéro de sécurité sociale
						est obligatoire.</div>
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-1 offset-5 ">
					<button class="btn btn-primary" id="creerCollaborateur"
						type="button">Créer</button>
				</div>
			</div>
		</form>
	</div>



	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Création d'un
						collaborateur</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<p>Vous êtes sur le point de créer un nouveau collaborateur :</p>
					<p>
						<br /> Nom : <span id="spanNom"></span>
					</p>
					<p>
						<br /> Prénom : <span id="spanPrenom"></span>
					<p>
						<br /> Date de naissance : <span id="spanDate"></span>
					</p>
					<p>
						<br /> Adresse : <span id="spanAdresse"></span>
					</p>
					<p>
						<br /> Numéro de sécurité sociale : <span id="spanSecu"></span>
					</p>
					<br />
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Annuler</button>
					<button id="modalValider" type="submit" class="btn btn-primary"
						data-modal="modal">Confirmer</button>
				</div>
			</div>
		</div>
	</div>


</body>
<footer> 
</footer>
<script src="<%=request.getContextPath()%>/input.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>





</html>