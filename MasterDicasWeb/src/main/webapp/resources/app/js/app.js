function mascaraData(input) {
    $(input).attr("maxlength", '10');
    $(input).mask("99/99/9999", {placeholder: "dd/mm/yyyy"});
}

function mascaraCurrency(input) {
    $(input).maskMoney({
        thousands: '.', decimal: ',', allowZero: true, prefix: 'R$ '
    });
}

function mostrarMenu(id, event) {
    var X = event.clientX;
    var Y = event.clientY;
    var menu = document.getElementById(id);
    menu.style.top = Y.toString() + "px";
    menu.style.left = X.toString() + "px";
    menu.style.visibility = "visible";
    var lis = document.querySelectorAll("#" + id + " > ul > li");
    for (var i = 0; i < lis.length; i++) {
        lis.item(i).addEventListener("click", function () {
            menu.style.visibility = "hidden";
        });
    }
}


$(document).ready(function () {
    $('.modal').modal();
    $(".button-collapse").sideNav();
    $('.tooltipped').tooltip({delay: 150});
});