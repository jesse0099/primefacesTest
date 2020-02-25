/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

window.onload = inicializar;

let btnIrLogin ;

function inicializar() {
    btnIrLogin= document.getElementById('btnCulo');
    btnIrLogin.addEventListener('click', navLogin, false);
}




function navLogin() {
    window.location.assign('faces/login.xhtml');
}