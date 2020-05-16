# Actions hash to call appropriate function dependent on action id.
# __Encrypt/Decrypt are Procs(lambdas).
@actions = {
  'encrypt' => ->(message, step){ message.bytes.map { |el| ((el+step)%255).chr }.join },
  'decrypt' => ->(message, step){ message.bytes.map { |el| ((el-step)%255).chr }.join }
}

def __main__ # Entrypoint
  # Input function.
  # __Gets message, cipher step and action id
  def __input__
    print "What's the message: "
    message = gets.chomp
    print "What's the step: "
    step = /^[^\d]*(\d+)/.match(gets.chomp)[1].to_i # Gets first integer from string using RegEx (To avoid wrong input)

    # Action id input function. Used to recursively call when wrong user input.
    def action
      print "What action you'd like to run? \n[0] Encrypt\n[1] Decrypt\n> "
      action = /^[^\d]*(\d+)/.match(gets.chomp)[1].to_i
      action() if(action > 1) # Call action input method again if action id is not correct
      action
    end

    message, step, action
  end

  message, step, action = __input__ # Save variables from STDIN
  result = @actions[(action === 1 ? 'encrypt' : 'decrypt')].call(message, step) # Call appropriate Proc

  puts "Result: result"
end
__main__
