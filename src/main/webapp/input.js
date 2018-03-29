if(document.querySelector('#creerCollaborateur') != null)
{
  document.querySelector('#creerCollaborateur').addEventListener('click', function(evt)
		  {
    if(document.querySelector('#nom').value == "" || document.querySelector('#prenom').value == "" ||  document.querySelector('#dateNaissance').value == ""|| document.querySelector('#adresse').value == "" ||  document.querySelector('#secu').value == "")
    {

        var lesErrors = document.querySelectorAll("input[type='text']");
        lesErrors.forEach(param => {param.classList.add('is-invalid')});
        lesErrors = document.querySelectorAll("input[type='date']");
        lesErrors.forEach(param => {param.classList.add('is-invalid')});
        lesErrors = document.querySelectorAll("input[type='tel']");
        lesErrors.forEach(param => {param.classList.add('is-invalid')});
        lesErrors = document.querySelectorAll('textarea');
        lesErrors.forEach(param => {param.classList.add('is-invalid')});
        lesErrors = document.querySelectorAll('select');
        lesErrors.forEach(param => {param.classList.add('is-invalid')});

    } else{

      var nom = document.querySelector("#nom").value;
      var prenom = document.querySelector("#prenom").value;
      var dateNaissance = document.querySelector("#dateNaissance").value;
      var adresse = document.querySelector("#adresse").value;
      var numeroSecuSocial = document.querySelector("#secu").value;
  
      document.querySelector("#spanNom").innerText = nom;
      document.querySelector("#spanPrenom").innerText = prenom;
      document.querySelector("#spanDate").innerText = dateNaissance;
      document.querySelector("#spanAdresse").innerText = adresse;
      document.querySelector("#spanSecu").innerText = numeroSecuSocial;
  
      $("#myModal").modal();
    }
  });
};

if(document.querySelector('#modalValider') != null){
  document.querySelector('#modalValider').addEventListener('click', function(evt){
	  document.forms[0].submit();
  });
}