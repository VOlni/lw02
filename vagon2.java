public class vagon2 extends vagon {
	
	public void IzmenitxChisloMest(int NovoeChisloMest) {
			super.ChisloMest = NovoeChisloMest;
		}
	
	public void ZanyatxMesto(int NomerMesta) {
			if(KolMest[NomerMesta - 1] == 1) {
				System.out.println("Место № " + NomerMesta + ", в вагоне № " + NomerEtogoVagona + " уже занято!");
			}
			KolMest[NomerMesta - 1] = 1;
		}
	
	private int KolMest[];
		public void PustojVagon(int NomerVagona) {
			NomerEtogoVagona = NomerVagona;
			KolMest = new int[ChisloMest];
			for(int i = 0; i < ChisloMest; i++) {
				KolMest[i] = 0;
			}
		}
				
	public void VagonInfo() {
		System.out.println("Вагон № " + NomerEtogoVagona);
		int SvobodnieMesta = 0;
		for(int i = 0; i < ChisloMest; i++) {
			if(KolMest[i] != 1) {
				SvobodnieMesta++;
			}
		}
		System.out.println("Число свободных мест = " + SvobodnieMesta);
		System.out.println("Свободные места:");
		for(int i = 0; i < ChisloMest; i++) {
			if(KolMest[i] == 0){
				System.out.print((i + 1) + " ");
			}
		}
		System.out.println("");
	}
} 