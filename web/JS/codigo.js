$(function(){ 
    $("#inscribirse").click(function(){  

            var numero=$("#cedula").val();
            if(numero.length < 7 || numero.length > 12){
                alert('Cedula invalida.');
                return false;
            }
 
            var clave=$("#contraseña").val();
            var rclave=$("#confirmar").val();

            if(clave === rclave){
                clave.setCustomValidity("");
            }
            else{
                alert("Las contraseñas no coinciden. Por favor intentelo de nuevo");
                return false;
            }
         
        function emailValido (){
            if ($("#correo").val().indexOf('@', 0) == -1 || $("#correo").val().indexOf('.', 0) == -1)
            {
                alert('El correo electrónico introducido no es correcto.');
                return false;
            }
        }
        
      
    });        
       
         
        
        
        
      
     $("#login").click(function(){
         document.location.href='inicioSesion.jsp?';
     });
     
     
    
});

