/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


window.addEventListener('load', function (){
    document.getElementById('btniniciar').addEventListener('click', function(){
        var contraseña1 = document.getElementById('txtpassword1');
        var contraseña2 = document.getElementById('txtpassword2');
       
        var bandera= false;
        
        if (contraseña1 === contraseña2)
        {
            bandera = true;
        }
        if (bandera)
        {
            document.getElementById('forminicio').submit();
        }
        else
        {
            alert('Las contraseñas no coinciden');
        }
    });
});