package br.com.fiap;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;

public class Window {

	protected Shell shlLojaFiapRun;
	private Button text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Window window = new Window();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlLojaFiapRun.open();
		shlLojaFiapRun.layout();
		while (!shlLojaFiapRun.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlLojaFiapRun = new Shell();
		shlLojaFiapRun.setSize(450, 300);
		shlLojaFiapRun.setText("Loja FIAP Run");
		
		text = new Button(shlLojaFiapRun, SWT.NONE);
		text.setFont(SWTResourceManager.getFont("Tw Cen MT Condensed Extra Bold", 16, SWT.NORMAL));
		text.setAlignment(SWT.LEFT);
		text.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		text.setText("a");
		text.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageDialog.openInformation(shlLojaFiapRun, "SWT", text_1.getText());
			}
		});
		text.setBounds(165, 169, 92, 43);
		text.setText("Clique aqui");
		
		text_1 = new Text(shlLojaFiapRun, SWT.BORDER);
		text_1.setBounds(31, 61, 368, 64);
		
		Label lblNewLabel = new Label(shlLojaFiapRun, SWT.NONE);
		lblNewLabel.setBounds(32, 39, 215, 15);
		lblNewLabel.setText("Digite aqui");

	}
}
