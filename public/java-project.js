let user = document.getElementById('form2Example1')
let pass = document.getElementById('form2Example2')


//mudar form para class
// document.querySelector('form').addEventListener('submit', function(event) {
//     event.preventDefault();
//     getLogin();
//   });

document.getElementById("openModal").addEventListener("click", function() {
    document.getElementById("ModalCadastro").style.display = "block";
});
  
document.getElementById("closeModal").addEventListener("click", function() {
    document.getElementById("ModalCadastro").style.display = "none";
});
  
function getCookie(name) {
    var cookieArr = document.cookie.split(";");
  
    for(var i = 0; i < cookieArr.length; i++) {
      var cookiePair = cookieArr[i].split("=");
  
      // Remover espaços em branco no início do nome do cookie
      if (cookiePair[0].trim() === name) {
        return decodeURIComponent(cookiePair[1]);
      }
    }
  
    // Se o cookie não for encontrado
    return null;
}
  
var cookieValue = getCookie("nome");

async function getLogin() {

    let credentials = user.value+":"+pass.value

    await fetch('https://ltd-nid-api.onrender.com/login', {
        headers: { "Authorization": `Basic ${credentials}`}
    }).then(res => {
        if (res.status != 200) { throw new Error("Bad Server Response"); }
            return res.text();
      })
      .then(res => console.log(res))
      .catch(err => console.error(err));

}

//REDIRECIONADOR DE LINKS:
function gotoLink(Link){
    console.log(Link.value);
    window.open(Link.value);
};

