function menufixoabout(){

	document.getElementsByClassName('navegacao')[0].setAttribute('style','position:fixed; float:left;width: 260px; height: 700px;');
	document.getElementById('conteudogeral').style.display="block";
	document.getElementsByTagName('header')[0].style.display="none";
	document.getElementById('2').setAttribute('style', 'color:#3c948b');
	document.getElementById('3').setAttribute('style', 'color:#000');
	document.getElementById('4').setAttribute('style', 'color:#000');
	$('#ancoraabout').animatescroll();
}

function menufixocontato(){

	document.getElementsByClassName('navegacao')[0].setAttribute('style','position:fixed; float:left;width: 260px; height: 700px;');
	document.getElementById('conteudogeral').style.display="block";
	document.getElementsByTagName('header')[0].style.display="none";
	document.getElementById('3').setAttribute('style', 'color:#3c948b');
	document.getElementById('4').setAttribute('style', 'color:#000');
	document.getElementById('2').setAttribute('style', 'color:#000');
	$('#contato').animatescroll();
}

function menufixocadastro(){

	document.getElementsByClassName('navegacao')[0].setAttribute('style','position:fixed; float:left;width: 260px; height: 700px;');
	document.getElementById('conteudogeral').style.display="block";
	document.getElementsByTagName('header')[0].style.display="none";
	document.getElementById('4').setAttribute('style', 'color:#3c948b');
	document.getElementById('3').setAttribute('style', 'color:#000');
	document.getElementById('2').setAttribute('style', 'color:#000');
	$('#cadastro').animatescroll();
}

function menufixologin(){

	document.getElementsByClassName('navegacao')[0].setAttribute('style','position:fixed; float:left;width: 260px; height: 700px;');
	document.getElementById('conteudogeral').style.display="block";
	document.getElementsByTagName('header')[0].style.display="none";
	document.getElementById('4').setAttribute('style', 'color:#3c948b');
	document.getElementById('3').setAttribute('style', 'color:#000');
	document.getElementById('2').setAttribute('style', 'color:#000');
	$('#login').animatescroll();
}

function desfixamenu(){
	document.getElementsByClassName('navegacao')[0].setAttribute('style','float:left;width: 260px; height: 700px;');
	document.getElementsByTagName('header')[0].style.display="block";
	document.getElementById('conteudogeral').style.display="none";
	document.getElementById('2').setAttribute('style', 'color:#000');
	document.getElementById('3').setAttribute('style', 'color:#000');
	document.getElementById('4').setAttribute('style', 'color:#000');
}

