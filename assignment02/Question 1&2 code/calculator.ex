defmodule Grades.Calculator do
  
  #Question 2.1: refactored average calculations into helper method avg
  def avg(grades)do
    if Enum.count(grades) == 0 do
        0
      else
        Enum.sum(grades) / Enum.count(grades)
      end
  end

  #Question 2.2: refactored participation condition into failed_to_participate? helper method
  def failed_to_participate?(avg_homework, avg_exams, num_labs) do 
      if avg_homework < 0.4 || avg_exams < 0.4 || num_labs < 3 do
        :true
      else
        :false
      end
  end

  #Question 2.3 refactored mark calculations into calculate_grade helper method
  def calculate_grade(avg_labs, avg_homework, midterm, final) do
      0.2 * avg_labs + 0.3 * avg_homework + 0.2 * midterm + 0.3 * final
  end

  #Question 2.4: refactored exam average calcualtion into calculate_exam method
  def calculate_exam(midterm, final) do
      (midterm + final) / 2
  end

  #Question 2.4: refactored num_labs calculate_exam into count_labs method
  def count_labs(labs) do
      labs
      |> Enum.reject(fn mark -> mark < 0.25 end)
      |> Enum.count()
  end



  def percentage_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    
    #Question 2.1: refactored code to use helper method avg
    avg_homework = avg(homework)

    #Question 2.1: refactored code to use helper method avg
    avg_labs = avg(labs)
    #Question 2.3: refactored mark calculation to use helper method calculate_grade
    mark = calculate_grade(avg_labs, avg_homework, midterm, final)
    round(mark * 100)
  end

  def letter_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    #Question 2.1: refactored code to use helper method avg
    avg_homework = avg(homework)

    #Question 2.1: refactored code to use helper method avg
    avg_labs = avg(labs)
    #Question 2.4: refactored code to use helper method calculate_exam
    avg_exams = calculate_exam(midterm, final)

    ##Question 2.4: refactored lab counts into count_labs
    num_labs = count_labs(labs)

    #Question 2.2: refactored conditional statement to use helper method failed_to_participate
    if failed_to_participate?(avg_homework, avg_exams, num_labs) do
      "EIN"
    else
      #Question 2.3: refactored mark calculation to use helper method calculate_grade
      mark = calculate_grade(avg_labs, avg_homework, midterm, final)
      cond do
        mark > 0.895 -> "A+"
        mark > 0.845 -> "A"
        mark > 0.795 -> "A-"
        mark > 0.745 -> "B+"
        mark > 0.695 -> "B"
        mark > 0.645 -> "C+"
        mark > 0.595 -> "C"
        mark > 0.545 -> "D+"
        mark > 0.495 -> "D"
        mark > 0.395 -> "E"
        :else -> "F"
      end
    end
  end

  def numeric_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    #Question 2.1: refactored code to use helper method avg
    avg_homework = avg(homework)

    #Question 2.1: refactored code to use helper method avg
    avg_labs = avg(labs)

    #Question 2.4: refactored code to use helper method calculate_exam
    avg_exams = calculate_exam(midterm, final)
    
    #Question 2.4: refactored lab counts into count_labs
    num_labs = num_labs = count_labs(labs)
    
    #Question 2.2: refactored conditional statement to use helper method failed_to_participate
    if failed_to_participate?(avg_homework, avg_exams, num_labs) do
      0
    else
      #Question 2.3: refactored mark calculation to use helper method calculate_grade
      mark = calculate_grade(avg_labs, avg_homework, midterm, final)
      cond do
        mark > 0.895 -> 10
        mark > 0.845 -> 9
        mark > 0.795 -> 8
        mark > 0.745 -> 7
        mark > 0.695 -> 6
        mark > 0.645 -> 5
        mark > 0.595 -> 4
        mark > 0.545 -> 3
        mark > 0.495 -> 2
        mark > 0.395 -> 1
        :else -> 0
      end
    end
  end
end
