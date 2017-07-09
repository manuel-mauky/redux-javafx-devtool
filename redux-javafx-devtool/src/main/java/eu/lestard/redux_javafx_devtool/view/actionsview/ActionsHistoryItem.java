package eu.lestard.redux_javafx_devtool.view.actionsview;

import com.netopyr.reduxfx.vscenegraph.VNode;
import eu.lestard.redux_javafx_devtool.state.ClientAction;

import java.time.format.DateTimeFormatter;

import static com.netopyr.reduxfx.vscenegraph.VScenegraphFactory.Label;
import static com.netopyr.reduxfx.vscenegraph.VScenegraphFactory.VBox;

public class ActionsHistoryItem {

	private ActionsHistoryItem() {
	}

	public static VNode view(ClientAction userAction) {
		return VBox()
			.children(
				Label()
					.text(userAction.getAction().getClass().getSimpleName())
					.style("-fx-font-size: 1.5em"),
				Label()
					.text(userAction.getDispatchTime().format(DateTimeFormatter.ISO_DATE_TIME))
			);
	}
}
