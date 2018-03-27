# Instructor
How to add Click to Copy functionality in my JSPs:

	<textarea id="text" rows="13" cols="60">
	Some Random Text
	</textarea>
	<button onclick="copy()">Copy</button>

<script type="text/javascript">
		function copy(){
			var text = document.getElementById('table');
			var range = document.createRange();
			range.selectNode(text);
			var selection = window.getSelection();
			selection.removeAllRanges(); 
			selection.addRange(range);
			document.execCommand('copy');
		}
	
</script>


How to pass attributes outside of Model or ModelMap from controller to JSP using HttpServletRequest:

@RequestMapping("/list")
	public String listCustomers(Model model,HttpServletRequest request){
		
		Iterable<Customer> customers = new ArrayList<Customer>();
		customers = customerRepository.findByFirstName("Vishwanath");
		
		model.addAttribute("customers",customers);
		request.setAttribute("heyString", "hey");
		
		return "list-customers";
		
		
	}
  
  Accessing the same in JSP:
  
  <h1>Hey : ${heyString}</h1>
