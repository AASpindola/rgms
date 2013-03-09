package pages

import geb.Page

class ConferenciaPage extends Page{

    static url = "conferencia/list"

    static at = {
        title ==~ /Confer�ncia Listagem/
    }

    static content = {

    }

    def selectNewConferencia() {
        $('a.create').click()
    }
	
    def listConferencia() {
        $('a.list').click()
    }
}