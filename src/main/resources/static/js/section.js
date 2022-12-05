let root = document.getElementById("hello");
const questions = [
    {
        title: [[${title}]],
        description: [[${title}]]
    }
];

const renderQuestion = questions => {
    let data = ``;
    questions.forEach(question => {
        data += `
            <div th:replace="~{fragments/header.html} :: section(
            title = ${questions.title},
            description = ${questions.description})"></div>`;
    });
    return data;
};


root.innerHTML = renderQuestion(questions);