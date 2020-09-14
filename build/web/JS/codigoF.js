$(function(){ 
$("#editarAct").click(function(){
         var tab = window.open('editarActividad.jsp?');
          return false;
     });
     $("#editarFaseA").click(function(){
         var tab = window.open('editarFaseActividad.jsp?');
          return false;
     });
     $("#editarinc").click(function(){
         var tab = window.open('editarIncentivo.jsp?');
          return false;
     });
     $("#eliminarAct").click(function(){
         var tab = window.open('eliminarActividad.jsp?');
          return false;
     });
});

