var casillasJugadas = {};
var contador = 0;

function jugar(id) {
    // Verificamos si la casilla ya ha sido jugada
    if (!casillasJugadas[id]) {

        var casilla = document.getElementById(id);
        var circulo = casilla.querySelector('.circulo');
        var cuadrado = casilla.querySelector('.cuadrado');

        if (contador === 0) {
            circulo.style.display = 'block';
            cuadrado.style.display = 'none';
            contador = 1;
        } else {
            circulo.style.display = 'none';
            cuadrado.style.display = 'block';
            contador = 0;
        }

        casillasJugadas[id] = true;
        return contador;
    }
}

function recargar(){
    location.reload();
}