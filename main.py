from data import question_data
from question_model import Question
from quiz_brain import quiz_brain
question_bank = []
for question in question_data:
    text = question["text"]
    answer = question["answer"]
    new_question = Question(text, answer)
    question_bank.append(new_question)

quiz = quiz_brain(question_bank)

while quiz.still_quizz():
     quiz.next_question()

print("completed")
print(f"score: {quiz.score}/ {quiz.question_num}")




