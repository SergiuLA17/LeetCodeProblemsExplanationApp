let root = document.getElementById("hello");
const questions = [
    {
        categories: [[${categories}]],
        title: [[${title}]],
        description: [[${description}]]
    }
];

const renderQuestion = questions => {
    let data = ``;
    questions.forEach(question => {
        data += `
            <div th:replace="fragments/section.html :: section(
            categories = ${questions.categories},
            title = ${questions.title},
            description = ${questions.description})"></div>`;
    });
    return data;
};


root.innerHTML = renderQuestion(questions);