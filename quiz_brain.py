class quiz_brain:
    def __init__(self,q_brain):
        self.question_num = 0
        self.questionlist = q_brain
    def still_quizz(self):
        return self.question_num < len(self.questionlist)
    def next_question(self):
        current_q = self.questionlist[self.question_num]
        self.question_num += 1
        user_answer = input(f"Q1.{self.question_num} : {current_q.text} True/False:")
        self.check_ans(user_answer, current_q.answer)
    def check_ans(self, user_answer, correct_ans):
        if user_answer.lower() == correct_ans.lower():
            self.score += 1
            print("You got it Right")
        else:
            print("OOhh OOhh that wasnt right")
            print(f"Your current score is: {self.score}/{self.question_num}")
            print("\n")



