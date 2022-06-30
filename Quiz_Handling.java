public class Quiz_Handling {

	public static void main(String[] args) {
		String data = "Quiz_1# qno_1: What comes next to First $first, second, third, fourth *2 # qno_2: What comes before second $first, second, third, fourth, fifth *1 \nQuiz_2# qno_1: What is liquid $water, bread, smoke *1 # qno_3: What is hot $ice-cream, candies, spices *3";
		String[] quizzes = data.split("\n");
		for (String quiz : quizzes) {
			String[] questions = quiz.split("#");
			boolean quizFound = false;
			for (String question : questions) {
				if (!quizFound) {
					System.out.println(question);
					quizFound = true;
				} else {
					String[] options = question.split("\\$");
					boolean questionFound = false;
					for (String opt : options) {
						if (!questionFound) {
							System.out.println(opt);
							questionFound = true;
						} else {
							String[] splittedOptions = opt.split(",");
							for (int i = 0; i < splittedOptions.length; i++) {
								if (i < splittedOptions.length - 1) {
									System.out.println("\t" + (i + 1) + ". " + splittedOptions[i]);
								} else {
									String[] splitCorrectChoice = splittedOptions[i].split("\\*");
									System.out.println("\t" + (i + 1) + ". " + splitCorrectChoice[0]);
									System.out.println("Correct Option: " + splitCorrectChoice[1]);

								}
							}
						}
					}
				}
			}
		}

	}

}
