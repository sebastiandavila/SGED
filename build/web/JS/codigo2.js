$(function(){ 
   // $("#login").click(function(){
     //   if(($("#usuario").val().length < 1) || (($("#clave").val().length <1))){
       //     alert("Los campos no pueden estar vacios");
         //   return false;
        //}
       // else{
     //   var nombre=$("#usuario").val();
       // var clave=$("#clave").val();
        
        //var tab = window.open('auxiliar.jsp?' + "usuario=" + nombre + "&clave=" + clave); 
        //document.location.href='auxiliar.jsp?' + $("#usuario").serialize();
        //return false;
   // } 
    //});
   $("#responderPregunta").click(function(){
        var tab = window.open('responderPregunta.jsp?');
       return false;
       });
       
    $("#actualizarPerfil").click(function(){
        var tab = window.open('actualizarPerfil.jsp?');
       return false;
       });
       
       $("#solucionActividad").click(function(){
        var tab = window.open('solucionActividad.jsp?');
       return false;
       });
});

 
