function samp(){
    var a=document.querySelector("#name").value
    var b=document.querySelector("#pass").value
    if(a==""){
        alert("name cannot be empty");
    }
    else if(b.toString().length<6){
          alert("password length should be greater than 6 digits");
    }
    else(){
        alert("satified");
    }
}