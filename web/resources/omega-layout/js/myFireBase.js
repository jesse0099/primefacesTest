/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.onload = ini;

let btnLogGoogle;
var googleProvider;

function ini() {
    //Listener de sesion activa
    firebase.auth().onAuthStateChanged(function (user) {
        if (user) {
            console.log('Usuario logueado');
            //Pasar al landing
            window.location.assign('faces/landing.xhtml');
        } else {
            //Nada
        }
    });

}

function googleLogIn(event) {
    firebase.auth().signInWithPopup(new firebase.auth.GoogleAuthProvider()).then(function (result) {
        //Todo bien
        window.location.assign('faces/landing.xhtml');
    }).catch(function (error) {
        console.log(error);
    });
}

function resetPassword(event) {
    var auth = firebase.auth();
    auth.sendPasswordResetEmail('jesechavez009@gmail.com').then(function () {
       //Modal de correo enviado
        alert("Done");
    }).catch(function (error) {
        alert("Error");
    });

}


