document.addEventListener("DOMContentLoaded", function () {
    var screen = document.getElementById("screen");
    var buttons = document.querySelectorAll("button");

    buttons.forEach(function (button) {
        button.addEventListener("click", function () {
            handleButtonClick(button.innerText);
        });
    });

    function handleButtonClick(value) {
        switch (value) {
            case "=":
                try {
                    screen.value = eval(screen.value);
                } catch (error) {
                    screen.value = "Error";
                }
                break;
            case "C":
                screen.value = "";
                break;
            default:
                screen.value += value;
        }
    }
});
