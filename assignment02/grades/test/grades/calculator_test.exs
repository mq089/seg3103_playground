defmodule Grades.CalculatorTest do
  use ExUnit.Case
  alias Grades.Calculator

describe "percentage_grade/1" do
    test "TC1" do
      assert 85 ==
               Calculator.percentage_grade(%{
                 homework: [0.8],
                 labs: [1, 1, 1],
                 midterm: 0.70,
                 final: 0.9
               })
    end
  end

describe "percentage_grade/2" do
    test "TC2" do
      assert 41 ==
               Calculator.percentage_grade(%{
                 homework: [],
                 labs: [],
                 midterm: 0.70,
                 final: 0.9
               })
    end
  end

describe "letter_grade/1" do
    test "TC3" do
      assert "EIN" ==
               Calculator.letter_grade(%{
                 homework: [],
                 labs: [],
                 midterm: 0,
                 final: 0
               })
    end
  end

  describe "letter_grade/2" do
    test "TC4" do
      assert "A+" ==
               Calculator.letter_grade(%{
                 homework: [1],
                 labs: [1,1,1],
                 midterm: 1,
                 final: 1
               })
    end
  end

  describe "letter_grade/3" do
    test "TC5" do
      assert "A" ==
               Calculator.letter_grade(%{
                 homework: [1],
                 labs: [1,1,1],
                 midterm: 0.4,
                 final: 1
               })
    end
  end

  describe "letter_grade/4" do
    test "TC6" do
      assert "A-" ==
               Calculator.letter_grade(%{
                 homework: [1],
                 labs: [1,1,1],
                 midterm: 0,
                 final: 1
               })
    end
  end

describe "letter_grade/5" do
    test "TC7" do
      assert "B+" ==
               Calculator.letter_grade(%{
                 homework: [1,0],
                 labs: [1,1,1,0,0],
                 midterm: 1,
                 final: 1
               })
    end
  end

describe "letter_grade/6" do
    test "TC8" do
      assert "B" ==
               Calculator.letter_grade(%{
                 homework: [1,0],
                 labs: [1,1,1,0,0],
                 midterm: 0.65,
                 final: 1
               })
    end
  end

  describe "letter_grade/7" do
    test "TC9" do
      assert "C+" ==
               Calculator.letter_grade(%{
                 homework: [1,0],
                 labs: [1,1,1,0,0],
                 midterm: 0.5,
                 final: 1
               })
    end
  end

 describe "letter_grade/8" do
    test "TC10" do
      assert "C" ==
               Calculator.letter_grade(%{
                 homework: [1,0],
                 labs: [1,1,1,0,0],
                 midterm: 0.3,
                 final: 1
               })
    end
  end

 describe "letter_grade/9" do
    test "TC11" do
      assert "D+" ==
               Calculator.letter_grade(%{
                 homework: [1,0],
                 labs: [1,1,1,0,0],
                 midterm: 0,
                 final: 1
               })
    end
  end

 describe "letter_grade/10" do
    test "TC12" do
      assert "D" ==
               Calculator.letter_grade(%{
                 homework: [1,0],
                 labs: [1,1,1,0,0],
                 midterm: 1,
                 final: 0.1
               })
    end
  end

describe "letter_grade/11" do
    test "TC13" do
      assert "E" ==
               Calculator.letter_grade(%{
                 homework: [1,0],
                 labs: [1,1,1,0,0],
                 midterm: 1,
                 final: 0
               })
    end
  end

describe "letter_grade/12" do
    test "TC14" do
      assert "F" ==
               Calculator.letter_grade(%{
                 homework: [0.4,0.4],
                 labs: [0.3,0.3,0.3,0.3,0.3],
                 midterm: 0.8,
                 final: 0
               })
    end
  end



describe "numeric_grade/1" do
    test "TC15" do
      assert 0 ==
               Calculator.numeric_grade(%{
                 homework: [],
                 labs: [],
                 midterm: 0,
                 final: 0
               })
    end
  end

  describe "numeric_grade/2" do
    test "TC16" do
      assert 10 ==
               Calculator.numeric_grade(%{
                 homework: [1],
                 labs: [1,1,1],
                 midterm: 1,
                 final: 1
               })
    end
  end

  describe "numeric_grade/3" do
    test "TC17" do
      assert 9 ==
               Calculator.numeric_grade(%{
                 homework: [1],
                 labs: [1,1,1],
                 midterm: 0.4,
                 final: 1
               })
    end
  end

  describe "numeric_grade/4" do
    test "TC18" do
      assert 8 ==
               Calculator.numeric_grade(%{
                 homework: [1],
                 labs: [1,1,1],
                 midterm: 0,
                 final: 1
               })
    end
  end

describe "numeric_grade/5" do
    test "TC19" do
      assert 7 ==
               Calculator.numeric_grade(%{
                 homework: [1,0],
                 labs: [1,1,1,0,0],
                 midterm: 1,
                 final: 1
               })
    end
  end

describe "numeric_grade/6" do
    test "TC20" do
      assert 6 ==
               Calculator.numeric_grade(%{
                 homework: [1,0],
                 labs: [1,1,1,0,0],
                 midterm: 0.65,
                 final: 1
               })
    end
  end

  describe "numeric_grade/7" do
    test "TC21" do
      assert 5 ==
               Calculator.numeric_grade(%{
                 homework: [1,0],
                 labs: [1,1,1,0,0],
                 midterm: 0.4,
                 final: 1
               })
    end
  end

 describe "numeric_grade/8" do
    test "TC22" do
      assert 4 ==
               Calculator.numeric_grade(%{
                 homework: [1,0],
                 labs: [1,1,1,0,0],
                 midterm: 0.35,
                 final: 1
               })
    end
  end

 describe "numeric_grade/9" do
    test "TC23" do
      assert 3 ==
               Calculator.numeric_grade(%{
                 homework: [1,0],
                 labs: [1,1,1,0,0],
                 midterm: 0,
                 final: 1
               })
    end
  end

 describe "numeric_grade/10" do
    test "TC24" do
      assert 2 ==
               Calculator.numeric_grade(%{
                 homework: [1,0],
                 labs: [1,1,1,0,0],
                 midterm: 1,
                 final: 0.1
               })
    end
  end

describe "numeric_grade/11" do
    test "TC25" do
      assert 1 ==
               Calculator.numeric_grade(%{
                 homework: [1,0],
                 labs: [1,1,1,0,0],
                 midterm: 1,
                 final: 0
               })
    end
  end

describe "numeric_grade/12" do
    test "TC26" do
      assert 0 ==
               Calculator.numeric_grade(%{
                 homework: [0.4,0.4],
                 labs: [0.3,0.3,0.3,0.2,0.2],
                 midterm: 0.8,
                 final: 0
               })
    end
  end

end
