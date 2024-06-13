defmodule Grades do
  @moduledoc """
  Grades keeps the contexts that define your domain
  and business logic.

  Contexts are also responsible for managing your data, regardless
  if it comes from the database, an external API or others.
  """
  
  #alias Grades.calculator
	defmodule Calculator do
		def letter_grade(_input) do
			"A+"
		end
	
		def percentage_grade(_grades) do
			95.0 
		end

		def numeric_grade(_grades) do
			4.0 
		end
	end 
  
end
