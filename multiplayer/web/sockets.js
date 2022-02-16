var wsURi = "ws://" + document.location.host +
    document.location.pathname + "endpoint";

var websocket = new WebSocket(wsURi);

websocket.onopen = function (){
    document.getElementById("connection").value =
        "Connected to " + wsURi;};

websocket.onmessage = function (evt){
    document.getElementById("output").innerHTML += evt.data + "\n";};

function send(){
    websocket.send(document.getElementById("input").value);
}