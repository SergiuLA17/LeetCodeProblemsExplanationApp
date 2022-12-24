//References
let timeLeft = document.querySelector(".time-left");
let quizContainer = document.getElementById("container");
let nextBtn = document.getElementById("next-button");
let countOfQuestion = document.querySelector(".number-of-question");
let displayContainer = document.getElementById("display-container");
let scoreContainer = document.querySelector(".score-container");
let restart = document.getElementById("restart");
let userScore = document.getElementById("user-score");
let startScreen = document.querySelector(".start-screen");
let startButton = document.getElementById("start-button");
let questionCount;
let scoreCount = 0;
let count = 21;
let countdown;
//Questions and Options array
const quizArray = [
    {
        id: "0",
        question: "Dece Java este un limbaj cross-platform?",
        options: ["Pentru ca poate folosi mai multe tipuri de variabile.", "Pentru ca se pot folosi multe framework-uri.", "Pentru ca JVM este implementate pe mai multe platforme."],
        correct: "Pentru ca JVM este implementate pe mai multe platforme.",
    },
    {
        id: "1",
        question: "Dece Java nu este limbaj orientat pe obiecte pe deplin?",
        options: ["Deoarece are posibilitatea de a folosi framework-uri.", "Deoarece are posibilitatea de a classe abstracte.", "Deoarece se folosesc tipuri de date primitive."],
        correct: "Deoarece se folosesc tipuri de date primitive.",
    },
    {
        id: "2",
        question: "Ce este autoboxing/unboxing?",
        options: ["Mecanismul de a descarca pachetele cu ajutorul framework-urilor.", "Mecanismul de convertire a tipurilor de date primitive in obiecte.", "Mecanismul de converti un tip de fisier in altul."],
        correct: "Mecanismul de convertire a tipurilor de date primitive in obiecte.",
    },
    {
        id: "3",
        question: "Care este diferenta inte metoda si constructor?",
        options: ["Metoda are o denumire anumita, pe cand constructorul nu are.", "Compilatorul va genera eroare.", "Metodele pot fi suprascrise, pe cand constructorii nu."],
        correct: "Metodele pot fi suprascrise, pe cand constructorii nu.",
    },
    {
        id: "4",
        question: "Va fi apelat constructorul superclasei cand este creat un obiect mostenit?",
        options: ["Da.", "Nu.", "Compilatorul va genera eroare."],
        correct: "Da.",
    },
    {
        id: "5",
        question: "Ce este incapsularea?",
        options: ["Un pilon al POO. Care incapsuleaza anumete date, metode si clase.", "Este un principiu dupa care se scrie o aplicatie.", "Este un mecanism de create clase."],
        correct: "Un pilon al POO. Care incapsuleaza anumete date, metode si clase.",
    },
    {
        id: "6",
        question: "Putem sa atribuim la this valoarea null?",
        options: ["Nu. Deoarece obiectul nu poate sa-si stearga referinta.", "Da. Deoarece this este o referinta. Si obiectul se va sterge din memorie.", "Compilatorul va genera eroare."],
        correct: "Nu. Deoarece obiectul nu poate sa-si stearga referinta.",
    },
    {
        id: "7",
        question: "Care este diferenta corecta dinte interfata si clasa abstracta?",
        options: ["Clasa abstracta reprezinta o stare a obiectului, pe cand interfata reprezinta o abilitate.", "Interfara poate avea diferiti modificatori de acces, pe cand clasa abstracta nu.", "Nu putem implementa metode in interfata, pe cand putem in clasa abstracta."],
        correct: "Clasa abstracta reprezinta o stare a obiectului, pe cand interfata reprezinta o abilitate.",
    },
    {
        id: "8",
        question: "Cand folosim interfata si cand folosim clasa abstracta?",
        options: ["Cand vrem, nu exista restricitii, care ne place aceia si folosim.", "Cand vrem sa fim siguri ca o metoda sa fie realizata 100%.", "Cand vrem sa scrim cod mai putin, folosim interfata."],
        correct: "Cand vrem sa fim siguri ca o metoda sa fie realizata 100%.",
    },
    {
        id: "9",
        question: "Care este afimatie este corecta dintre TreeSet si HashSet?",
        options: ["Are diferite structuri de date.", "Implementeaza diferite interfete.", "Putem avea null in ambele."],
        correct: "Are diferite structuri de date.",
    },
    {
        id: "10",
        question: "Cum se compara obiectele in HashSet?",
        options: ["Cu ajutorul bibliotecilor care se importeaza.", "Cu ajutorul metodei equals si hashCode.", "In HashSet nu se compara obiectele."],
        correct: "Cu ajutorul metodei equals si hashCode.",
    },
    {
        id: "11",
        question: "Poate TreeSet avea null?",
        options: ["Da.", "Nu deoarece in TreeSet obiectele se compara. Nu putem compara null cu obiecte.", "Da. Deoarece TreeSet implementeaza interfata SortedSet."],
        correct: "Nu deoarece in TreeSet obiectele se compara. Nu putem compara null cu obiecte.",
    },
    {
        id: "12",
        question: "Ce fel de metode se folosesc in TreeSet? pentru sortare si comparare?",
        options: ["Putem scrie metodele proprii de comparare folosind biblioteci importate.", "Putem folosi interfata Comparable.", "Putem folosi  clasa anonima."],
        correct: "Putem folosi interfata Comparable.",
    },
    {
        id: "13",
        question: "Ce este JRE?",
        options: ["Este un mediu de rulare pentru aplicatii Java.", "Este un mediu de a scrie aplicatii Java.", "Este un mediu ce contine biblioteci Java."],
        correct: "Este un mediu de rulare pentru aplicatii Java.",
    },
    {
        id: "14",
        question: "Care metoda este mai securizata pentru a interactiona cu parole in aplicatia Java?",
        options: ["Folosim String array.", "Folosim StringBuilder array.", "Folosim char array."],
        correct: "Folosim char array.",
    },
    {
        id: "15",
        question: "Care afirmatie este corecta legata de HashMap si HashTable?",
        options: ["HashTable nu se foloseste, deoarece este mai lent decat HashMap.", "Se foloseste HashTable, deoarece este sincronizat si este mai rapida.", "HashMap se foloseste pentru paralelizm."],
        correct: "HashTable nu se foloseste, deoarece este mai lent decat HashMap.",
    },
    {
        id: "16",
        question: "Pentru ce avem nevoie clasa Immutable?",
        options: ["Reprzinta o calsa care poate folosi mostenire multiple.", "Repreinta o calsa abstracta.", "Pentru a crea obiecte care nu pot fi modificate."],
        correct: "Pentru a crea obiecte care nu pot fi modificate.",
    },
    {
        id: "17",
        question: "Ce este un enum?",
        options: ["Este o structura de date cu o lista de valori. Care nu pot fi schimbate.", "Este o clasa din care putem crea instante si sa le folosim.", "Este o clasa abstracta care poate fi mostenita."],
        correct: "Este o structura de date cu o lista de valori. Care nu pot fi schimbate.",
    },
    {
        id: "18",
        question: "Care afirmatie este corecta, legata de avantajul enum fata de constante?",
        options: ["Nu este nici un avantajm, in aceiasi situatie putem folosi ambele.", "Diferenta este ca enum este legat de tip, dar constante nu.", "Enum este mai rapid decat constante."],
        correct: "Diferenta este ca enum este legat de tip, dar constante nu.",
    },
    {
        id: "19",
        question: "Care este diferenta dintere singletone si prototype?",
        options: ["Singletone creaa instantele la startarea aplicatiei si pot fi sterse la cerere.", "Prototype sunt instante care sunt dirijate cat de aplicatie atat si de catre utilizator.", "Singletone creaza instanta la startarea aplicatiei, iar prototype la cerere."],
        correct: "Singletone creaza instanta la startarea aplicatiei, iar prototype la cerere.",
    },
];
//Restart Quiz
restart.addEventListener("click", () => {
    initial();
    displayContainer.classList.remove("hide");
    scoreContainer.classList.add("hide");
});
//Next Button
nextBtn.addEventListener(
    "click",
    (displayNext = () => {
        //increment questionCount
        questionCount += 1;
        //if last question
        if (questionCount === quizArray.length) {
            //hide question container and display score
            displayContainer.classList.add("hide");
            scoreContainer.classList.remove("hide");
            //user score
            $.ajax({
                type: "POST",
                url: "/manageCandidatesPage",
                data: JSON.stringify((scoreCount/questionCount)*100),
                contentType: "application/json; charset=utf-8",
                dataType: "json"
            });
            userScore.innerHTML =
                "Your score is " + scoreCount + " out of " + questionCount;
        } else {
            //display questionCount
            countOfQuestion.innerHTML =
                questionCount + 1 + " of " + quizArray.length + " Question";
            //display quiz
            quizDisplay(questionCount);
            count = 11;
            clearInterval(countdown);
            timerDisplay();
        }
    })
);
//Timer
const timerDisplay = () => {
    countdown = setInterval(() => {
        count--;
        timeLeft.innerHTML = `${count}s`;
        if (count === 0) {
            clearInterval(countdown);
            displayNext();
        }
    }, 2000);
};
//Display quiz
const quizDisplay = (questionCount) => {
    let quizCards = document.querySelectorAll(".container-mid");
    //Hide other cards
    quizCards.forEach((card) => {
        card.classList.add("hide");
    });
    //display current question card
    quizCards[questionCount].classList.remove("hide");
};
//Quiz Creation
function quizCreator() {
    //randomly sort questions
    quizArray.sort(() => Math.random() - 0.5);
    //generate quiz
    for (let i of quizArray) {
        //randomly sort options
        i.options.sort(() => Math.random() - 0.5);
        //quiz card creation
        let div = document.createElement("div");
        div.classList.add("container-mid", "hide");
        //question number
        countOfQuestion.innerHTML = 1 + " of " + quizArray.length + " Question";
        //question
        let question_DIV = document.createElement("p");
        question_DIV.classList.add("question");
        question_DIV.innerHTML = i.question;
        div.appendChild(question_DIV);
        //options
        div.innerHTML += `
    <button class="option-div" onclick="checker(this)">${i.options[0]}</button>
     <button class="option-div" onclick="checker(this)">${i.options[1]}</button>
      <button class="option-div" onclick="checker(this)">${i.options[2]}</button>
    `;
        quizContainer.appendChild(div);
    }
}
//Checker Function to check if option is correct or not
function checker(userOption) {
    let userSolution = userOption.innerText;
    let question =
        document.getElementsByClassName("container-mid")[questionCount];
    let options = question.querySelectorAll(".option-div");
    //if user clicked answer == correct option stored in object
    if (userSolution === quizArray[questionCount].correct) {
        userOption.classList.add("correct");
        scoreCount++;
    } else {
        userOption.classList.add("incorrect");
        //For marking the correct option
        options.forEach((element) => {
            if (element.innerText === quizArray[questionCount].correct) {
                element.classList.add("correct");
            }
        });
    }
    //clear interval(stop timer)
    clearInterval(countdown);
    //disable all options
    options.forEach((element) => {
        element.disabled = true;
    });
}
//initial setup
function initial() {
    quizContainer.innerHTML = "";
    questionCount = 0;
    scoreCount = 0;
    count = 11;
    clearInterval(countdown);
    timerDisplay();
    quizCreator();
    quizDisplay(questionCount);

}
//when user click on start button
startButton.addEventListener("click", () => {
    startScreen.classList.add("hide");
    displayContainer.classList.remove("hide");
    initial();
});
//hide quiz and display start screen
window.onload = () => {
    startScreen.classList.remove("hide");
    displayContainer.classList.add("hide");
};
