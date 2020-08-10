class TournamentView extends React.Component {
    constructor (props) {
        super (props);
        this.state = {tournaments:'empty'};
    }

    componentWillMount () {
        console.log('component will mount');
    }

    componentDidMount () {
        console.log('component did mount');
        $.ajax({
            url: '/tournaments',
            dataType: 'json',
            success: function(data) {
                 this.setState({tournaments: data});
            }.bind(this)
        });
    }

    render() {
        if (this.state.tournaments === 'empty') {
            console.log('Rendering empty tournaments');
            return(
                React.createElement('div', {className: 'TournamentView'},
                  React.createElement('h1', {className: 'TournamentView-title'}, "Tournaments")
                )
            )
        } else {
            console.log('Rendering filled tournaments');
            return(
                React.createElement('div', {className: 'TournamentView'},
                  React.createElement('h1', {className: 'TournamentView-title'}, "Tournaments"),
                  React.createElement('ul', null,
                    this.state.tournaments.map(function(tournament){
                      return React.createElement('li', null, tournament.name);
                    })
                  )
                )
            )
        }
    }
}
